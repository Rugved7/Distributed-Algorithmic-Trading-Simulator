package service

import (
	"context"
	"log/slog"
	"sync"
	"time"
)

// Runtime wires background workers; business logic is intentionally deferred.
type Runtime struct {
	logger *slog.Logger
	jobs   chan struct{}
}

func NewRuntime(logger *slog.Logger) *Runtime {
	return &Runtime{
		logger: logger,
		jobs:   make(chan struct{}, 1024),
	}
}

func (r *Runtime) Start(ctx context.Context) {
	var wg sync.WaitGroup
	wg.Add(2)

	go func() {
		defer wg.Done()
		r.producerLoop(ctx)
	}()

	go func() {
		defer wg.Done()
		r.consumerLoop(ctx)
	}()

	<-ctx.Done()
	close(r.jobs)
	wg.Wait()
	r.logger.Info("runtime stopped")
}

func (r *Runtime) producerLoop(ctx context.Context) {
	ticker := time.NewTicker(1 * time.Second)
	defer ticker.Stop()

	for {
		select {
		case <-ctx.Done():
			return
		case <-ticker.C:
			select {
			case r.jobs <- struct{}{}:
			default:
				r.logger.Warn("jobs channel full; dropping event")
			}
		}
	}
}

func (r *Runtime) consumerLoop(ctx context.Context) {
	for {
		select {
		case <-ctx.Done():
			return
		case _, ok := <-r.jobs:
			if !ok {
				return
			}
			// TODO(phase2): process stream event and publish to Kafka topic.
		}
	}
}
