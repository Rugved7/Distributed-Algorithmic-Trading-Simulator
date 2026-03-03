package com.trading.strategy_service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class AiAnalysisRequestedConsumer {

    private static final Logger log = LoggerFactory.getLogger(AiAnalysisRequestedConsumer.class);

    @KafkaListener(
            topics = "${topics.ai-analysis-requested}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void onMessage(String payload) {
        // Stub only: will parse/validate schema and dispatch processing in next phase.
        log.info("ai-analysis-requested received: {}", payload);
    }
}
