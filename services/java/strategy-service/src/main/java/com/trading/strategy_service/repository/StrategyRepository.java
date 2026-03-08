package com.trading.strategy_service.repository;

import com.trading.strategy_service.model.Strategy;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface StrategyRepository {
    Strategy create(UUID userId, String name, String strategyType, Map<String, String> parameters);

    Optional<Strategy> findById(UUID strategyId);
}
