package com.trading.strategy_service.model;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record Strategy (
    UUID id,
    UUID userId,
    String name,
    String strategyType,
    Map<String, String> parameters,
    String status,
    Instant createdAt,
    Instant updatedAt
){
}
