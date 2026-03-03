package com.trading.strategy_service.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class StrategyEventPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String strategyTriggeredTopic;

    public StrategyEventPublisher(
            KafkaTemplate<String, String> kafkaTemplate,
            @Value("${topics.strategy-triggered}") String strategyTriggeredTopic
    ) {
        this.kafkaTemplate = kafkaTemplate;
        this.strategyTriggeredTopic = strategyTriggeredTopic;
    }

    public void publishStrategyTriggeredStub(String strategyId, String symbol, String signal) {
        String payload = "{\"strategyId\":\"" + strategyId + "\",\"symbol\":\"" + symbol + "\",\"signal\":\"" + signal + "\"}";
        kafkaTemplate.send(strategyTriggeredTopic, strategyId, payload);
    }
}
