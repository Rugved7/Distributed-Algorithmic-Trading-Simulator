package com.trading.strategy_service.service;

import com.trading.strategy_service.api.dto.CreateStrategyRequest;
import com.trading.strategy_service.api.dto.StrategyResponse;
import com.trading.strategy_service.kafka.StrategyEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class StrategyAppServiceImpl implements StrategyAppService {
    private final StrategyEventPublisher eventPublisher;

    public StrategyAppServiceImpl(StrategyEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }


    @Override
    public StrategyResponse createStub(CreateStrategyRequest request) {
        String strategyId = UUID.randomUUID().toString();
        eventPublisher.publishStrategyTriggeredStub(strategyId, request.strategyType(), "HOLD");
        return new StrategyResponse(strategyId, request.userId(), request.name(), request.strategyType(), "DRAFT", request.parameters());
    }

    @Override
    public StrategyResponse getStub(String strategyId) {
        return new StrategyResponse(strategyId, "stub-user", "stub-name", "SMA", "DRAFT", Map.of());
    }
}
