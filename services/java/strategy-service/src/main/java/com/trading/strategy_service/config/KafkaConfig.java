package com.trading.strategy_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    NewTopic strategyTriggeredTopic(@Value("${topics.strategy-triggered}") String topic) {
        return TopicBuilder.name(topic).partitions(6).replicas(1).build();
    }

    @Bean
    NewTopic aiAnalysisRequestedTopic(@Value("${topics.ai-analysis-requested}") String topic) {
        return TopicBuilder.name(topic).partitions(6).replicas(1).build();
    }
}
