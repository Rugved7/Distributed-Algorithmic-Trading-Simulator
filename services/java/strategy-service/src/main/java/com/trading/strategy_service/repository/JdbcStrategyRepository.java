package com.trading.strategy_service.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trading.strategy_service.model.Strategy;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JdbcStrategyRepository implements StrategyRepository{

    private static final String INSERT_SQL = """
            INSERT INTO trading.strategies (user_id, name, strategy_type, parameters_json, status)
            VALUES (:userId, :name, :strategyType, CAST(:parametersJson AS jsonb), 'DRAFT')
            RETURNING id, user_id, name, strategy_type, parameters_json, status, created_at, updated_at
            """;

    private static final String FIND_BY_ID_SQL = """
            SELECT id, user_id, name, strategy_type, parameters_json, status, created_at, updated_at
            FROM trading.strategies
            WHERE id = :strategyId
            """;

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper;

    public JdbcStrategyRepository(NamedParameterJdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public Strategy create(UUID userId, String name, String strategyType, Map<String, String> parameters) {
        try {
            String parametersJSON = objectMapper.writeValueAsString(parameters);
            MapSqlParameterSource sqlParams = new MapSqlParameterSource()
                    .addValue("userId", userId)
                    .addValue("name", name)
                    .addValue("strategyType", strategyType)
                    .addValue("parametersJson", parametersJSON);

            return jdbcTemplate.queryForObject(INSERT_SQL, sqlParams, strategyRowMapper());
        } catch (Exception ex) {
            throw new RuntimeException("Failed to create strategy", ex);
        }
    }

    @Override
    public Optional<Strategy> findById(UUID strategyId) {
        MapSqlParameterSource sqlParams = new MapSqlParameterSource()
                .addValue("strategyId", strategyId);

        return jdbcTemplate.query(FIND_BY_ID_SQL, sqlParams, strategyRowMapper())
                .stream()
                .findFirst();
    }
    private RowMapper<Strategy> strategyRowMapper() {
        return (rs, rowNum) -> mapRow(rs);
    }

    private Strategy mapRow(ResultSet rs) throws SQLException {
        try {
            Map<String, String> parameters = objectMapper.readValue(
                    rs.getString("parameters_json"),
                    new TypeReference<>() {}
            );

            return new Strategy(
                    rs.getObject("id", UUID.class),
                    rs.getObject("user_id", UUID.class),
                    rs.getString("name"),
                    rs.getString("strategy_type"),
                    parameters,
                    rs.getString("status"),
                    rs.getObject("created_at", Instant.class),
                    rs.getObject("updated_at", Instant.class)
            );
        } catch (Exception ex) {
            throw new RuntimeException("Failed to map strategy row", ex);
        }
    }
}
