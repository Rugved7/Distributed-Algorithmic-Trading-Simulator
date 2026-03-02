package transport

import (
	"context"
	"fmt"
	"log/slog"
	"net/http"
	"time"

	"github.com/trading/metrics-aggregation-service/internal/health"
)

type HTTPServer struct {
	server *http.Server
	logger *slog.Logger
}

func NewHTTPServer(serviceName string, port int, logger *slog.Logger) *HTTPServer {
	mux := http.NewServeMux()
	health.Register(mux, serviceName)

	return &HTTPServer{
		server: &http.Server{
			Addr:              fmt.Sprintf(":%d", port),
			Handler:           mux,
			ReadHeaderTimeout: 5 * time.Second,
		},
		logger: logger,
	}
}

func (h *HTTPServer) Start(errCh chan<- error) {
	h.logger.Info("http server starting", "addr", h.server.Addr)
	if err := h.server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		errCh <- err
	}
}

func (h *HTTPServer) Shutdown(ctx context.Context) error {
	h.logger.Info("http server shutting down")
	return h.server.Shutdown(ctx)
}
