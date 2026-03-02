package kafka

import (
	"fmt"

	"github.com/IBM/sarama"
)

// BuildConfig returns Sarama configuration used by publishers/consumers.
func BuildConfig(clientID string) *sarama.Config {
	cfg := sarama.NewConfig()
	cfg.Version = sarama.V3_6_0_0
	cfg.ClientID = clientID

	cfg.Producer.RequiredAcks = sarama.WaitForAll
	cfg.Producer.Return.Successes = true
	cfg.Producer.Idempotent = true
	cfg.Producer.Retry.Max = 5

	cfg.Consumer.Offsets.Initial = sarama.OffsetNewest
	cfg.Consumer.Group.Rebalance.GroupStrategies = []sarama.BalanceStrategy{sarama.NewBalanceStrategyRange()}

	return cfg
}

func ValidateBrokers(brokers []string) error {
	if len(brokers) == 0 {
		return fmt.Errorf("at least one kafka broker is required")
	}
	return nil
}
