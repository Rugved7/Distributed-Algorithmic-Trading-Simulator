package main

import (
	"context"
	"encoding/json"
	"log/slog"
	"os"
	"os/signal"
	"syscall"
	"time"

	"github.com/trading/metrics-aggregation-service/internal/config"
	"github.com/trading/metrics-aggregation-service/internal/kafka"
	"github.com/trading/metrics-aggregation-service/internal/service"
	"github.com/trading/metrics-aggregation-service/internal/transport"
)

func main() {
	cfg, err := config.Load()
	if err != nil {
		slog.Error("failed to load config", "error", err)
		os.Exit(1)
	}

	logger := buildJSONLogger()
	logger.Info("service starting", "service", cfg.ServiceName)

	if err := kafka.ValidateBrokers(cfg.KafkaBrokers); err != nil {
		logger.Error("invalid kafka config", "error", err)
		os.Exit(1)
	}
	_ = kafka.BuildConfig(cfg.KafkaClientID)

	ctx, cancel := context.WithCancel(context.Background())
	defer cancel()

	errCh := make(chan error, 1)

	httpServer := transport.NewHTTPServer(cfg.ServiceName, cfg.HTTPPort, logger)
	go httpServer.Start(errCh)

	runtime := service.NewRuntime(logger)
	go runtime.Start(ctx)

	sigCh := make(chan os.Signal, 1)
	signal.Notify(sigCh, syscall.SIGINT, syscall.SIGTERM)

	select {
	case sig := <-sigCh:
		logger.Info("shutdown signal received", "signal", sig.String())
	case srvErr := <-errCh:
		logger.Error("server exited with error", "error", srvErr)
	}

	cancel()

	shutdownCtx, shutdownCancel := context.WithTimeout(context.Background(), cfg.ShutdownTimeout)
	defer shutdownCancel()

	if err := httpServer.Shutdown(shutdownCtx); err != nil {
		logger.Error("graceful shutdown failed", "error", err)
		os.Exit(1)
	}

	// Small delay to flush async logs in local dev runtime.
	time.Sleep(100 * time.Millisecond)
	logger.Info("service stopped", "service", cfg.ServiceName)
}

func buildJSONLogger() *slog.Logger {
	handler := slog.NewJSONHandler(os.Stdout, &slog.HandlerOptions{Level: slog.LevelInfo})
	return slog.New(handler)
}

func _encode(v any) string {
	b, _ := json.Marshal(v)
	return string(b)
}
