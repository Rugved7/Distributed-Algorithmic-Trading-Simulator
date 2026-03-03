package com.trading.strategy_service.api;

import com.trading.strategy_service.api.dto.CreateStrategyRequest;
import com.trading.strategy_service.api.dto.StrategyResponse;
import com.trading.strategy_service.service.StrategyAppService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/strategies")
public class StrategyController {

    private final StrategyAppService strategyAppService;

    public StrategyController(StrategyAppService strategyAppService) {
        this.strategyAppService = strategyAppService;
    }

    @PostMapping
    public ResponseEntity<StrategyResponse> create(@Valid @RequestBody CreateStrategyRequest request) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(strategyAppService.createStub(request));
    }

    @GetMapping("/{strategyId}")
    public ResponseEntity<StrategyResponse> get(@PathVariable String strategyId) {
        return ResponseEntity.ok(strategyAppService.getStub(strategyId));
    }
}
