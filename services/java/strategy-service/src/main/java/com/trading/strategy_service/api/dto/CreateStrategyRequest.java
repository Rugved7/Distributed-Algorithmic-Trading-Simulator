package com.trading.strategy_service.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record CreateStrategyRequest(
    @NotBlank String userId,
    @NotBlank String name,
    @NotBlank String strategyType,
    @NotNull Map<String, String> parameters
) {}
