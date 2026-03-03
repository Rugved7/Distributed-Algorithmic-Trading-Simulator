package com.trading.strategy_service.api.dto;

import java.util.Map;

public record StrategyResponse(
        String strategyId,
        String userId,
        String name,
        String strategyType,
        String status,
        Map<String, String> parameters
) {}
