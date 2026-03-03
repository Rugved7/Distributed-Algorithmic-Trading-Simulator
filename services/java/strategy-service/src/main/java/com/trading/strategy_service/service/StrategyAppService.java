package com.trading.strategy_service.service;

import com.trading.strategy_service.api.dto.CreateStrategyRequest;
import com.trading.strategy_service.api.dto.StrategyResponse;

public interface StrategyAppService {
    StrategyResponse createStub(CreateStrategyRequest request);
    StrategyResponse getStub(String strategyId);
}
