package com.trading.api_gateway.health;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health/live")
public ResponseEntity<Map<String, Object>> liveness() {
    return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "ap-gateway",
            "timestamp", Instant.now().toString()
    ));
}
}