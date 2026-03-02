package config

import (
	"fmt"
	"os"
	"strconv"
	"time"
)

// Config stores runtime settings from environment variables only.
type Config struct {
	ServiceName     string
	HTTPPort        int
	KafkaBrokers    []string
	KafkaClientID   string
	ShutdownTimeout time.Duration
}

func Load() (Config, error) {
	serviceName := getenv("SERVICE_NAME", "market-data-service")

	port, err := parseInt(getenv("HTTP_PORT", "8091"))
	if err != nil {
		return Config{}, fmt.Errorf("invalid HTTP_PORT: %w", err)
	}

	brokers := splitComma(getenv("KAFKA_BROKERS", "kafka:9092"))
	if len(brokers) == 0 {
		return Config{}, fmt.Errorf("KAFKA_BROKERS cannot be empty")
	}

	shutdownMs, err := parseInt(getenv("SHUTDOWN_TIMEOUT_MS", "10000"))
	if err != nil {
		return Config{}, fmt.Errorf("invalid SHUTDOWN_TIMEOUT_MS: %w", err)
	}

	cfg := Config{
		ServiceName:     serviceName,
		HTTPPort:        port,
		KafkaBrokers:    brokers,
		KafkaClientID:   getenv("KAFKA_CLIENT_ID", serviceName),
		ShutdownTimeout: time.Duration(shutdownMs) * time.Millisecond,
	}

	return cfg, nil
}

func getenv(key, fallback string) string {
	v := os.Getenv(key)
	if v == "" {
		return fallback
	}
	return v
}

func parseInt(value string) (int, error) {
	return strconv.Atoi(value)
}

func splitComma(value string) []string {
	parts := make([]string, 0, 4)
	start := 0
	for i := 0; i <= len(value); i++ {
		if i == len(value) || value[i] == ',' {
			if i > start {
				parts = append(parts, value[start:i])
			}
			start = i + 1
		}
	}
	return parts
}
