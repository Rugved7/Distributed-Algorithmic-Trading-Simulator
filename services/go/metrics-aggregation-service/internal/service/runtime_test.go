package service

import (
	"context"
	"io"
	"log/slog"
	"testing"
	"time"
)

func TestRuntimeStopsOnContextCancel(t *testing.T) {
	logger := slog.New(slog.NewJSONHandler(io.Discard, nil))
	runtime := NewRuntime(logger)

	ctx, cancel := context.WithCancel(context.Background())
	done := make(chan struct{})

	go func() {
		runtime.Start(ctx)
		close(done)
	}()

	cancel()

	select {
	case <-done:
	case <-time.After(2 * time.Second):
		t.Fatal("runtime did not stop after context cancellation")
	}
}
