-- Phase 3 / Point 2: PostgreSQL baseline schema
-- Clear schema separation:
--   auth    -> identity
--   trading -> strategies, orders, trades, portfolios, backtests

CREATE SCHEMA IF NOT EXISTS auth;
CREATE SCHEMA IF NOT EXISTS trading;

-- Optional for UUID generation (Postgres 13+)
CREATE EXTENSION IF NOT EXISTS pgcrypto;

-- ----------------------------
-- auth.users
-- ----------------------------
CREATE TABLE IF NOT EXISTS auth.users (
    id              UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    email           VARCHAR(320) NOT NULL UNIQUE,
    password_hash   TEXT NOT NULL,
    role            VARCHAR(50) NOT NULL DEFAULT 'USER',
    status          VARCHAR(30) NOT NULL DEFAULT 'ACTIVE',
    created_at      TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at      TIMESTAMPTZ NOT NULL DEFAULT NOW()
);

CREATE INDEX IF NOT EXISTS idx_users_email ON auth.users(email);
CREATE INDEX IF NOT EXISTS idx_users_status ON auth.users(status);

-- ----------------------------
-- trading.strategies
-- ----------------------------
CREATE TABLE IF NOT EXISTS trading.strategies (
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id           UUID NOT NULL,
    name              VARCHAR(120) NOT NULL,
    strategy_type     VARCHAR(50) NOT NULL, -- SMA, RSI, ...
    parameters_json   JSONB NOT NULL DEFAULT '{}'::jsonb,
    status            VARCHAR(30) NOT NULL DEFAULT 'DRAFT', -- DRAFT/ACTIVE/PAUSED
    created_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_strategies_user
      FOREIGN KEY (user_id) REFERENCES auth.users(id) ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_strategies_user_id ON trading.strategies(user_id);
CREATE INDEX IF NOT EXISTS idx_strategies_status ON trading.strategies(status);
CREATE INDEX IF NOT EXISTS idx_strategies_type ON trading.strategies(strategy_type);

-- ----------------------------
-- trading.portfolios
-- ----------------------------
CREATE TABLE IF NOT EXISTS trading.portfolios (
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id           UUID NOT NULL,
    base_currency     VARCHAR(10) NOT NULL DEFAULT 'USD',
    cash_balance      NUMERIC(20,8) NOT NULL DEFAULT 0,
    total_equity      NUMERIC(20,8) NOT NULL DEFAULT 0,
    created_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_portfolios_user
      FOREIGN KEY (user_id) REFERENCES auth.users(id) ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_portfolios_user_id ON trading.portfolios(user_id);

-- ----------------------------
-- trading.backtests
-- ----------------------------
CREATE TABLE IF NOT EXISTS trading.backtests (
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    strategy_id       UUID NOT NULL,
    user_id           UUID NOT NULL,
    symbol            VARCHAR(20) NOT NULL,
    from_date         DATE NOT NULL,
    to_date           DATE NOT NULL,
    initial_capital   NUMERIC(20,8) NOT NULL,
    status            VARCHAR(30) NOT NULL DEFAULT 'QUEUED',
    pnl               NUMERIC(20,8),
    sharpe_ratio      NUMERIC(12,6),
    max_drawdown      NUMERIC(12,6),
    created_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    completed_at      TIMESTAMPTZ,

    CONSTRAINT fk_backtests_strategy
      FOREIGN KEY (strategy_id) REFERENCES trading.strategies(id) ON DELETE CASCADE,
    CONSTRAINT fk_backtests_user
      FOREIGN KEY (user_id) REFERENCES auth.users(id) ON DELETE CASCADE,
    CONSTRAINT chk_backtests_date_range CHECK (to_date >= from_date)
);

CREATE INDEX IF NOT EXISTS idx_backtests_strategy_id ON trading.backtests(strategy_id);
CREATE INDEX IF NOT EXISTS idx_backtests_user_id ON trading.backtests(user_id);
CREATE INDEX IF NOT EXISTS idx_backtests_symbol ON trading.backtests(symbol);
CREATE INDEX IF NOT EXISTS idx_backtests_status ON trading.backtests(status);

-- ----------------------------
-- trading.orders
-- ----------------------------
CREATE TABLE IF NOT EXISTS trading.orders (
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    strategy_id       UUID NOT NULL,
    portfolio_id      UUID NOT NULL,
    symbol            VARCHAR(20) NOT NULL,
    side              VARCHAR(10) NOT NULL,   -- BUY/SELL
    order_type        VARCHAR(10) NOT NULL,   -- MARKET/LIMIT
    quantity          BIGINT NOT NULL CHECK (quantity > 0),
    limit_price       NUMERIC(20,8),
    status            VARCHAR(30) NOT NULL DEFAULT 'SUBMITTED',
    submitted_at      TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at        TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_orders_strategy
      FOREIGN KEY (strategy_id) REFERENCES trading.strategies(id) ON DELETE RESTRICT,
    CONSTRAINT fk_orders_portfolio
      FOREIGN KEY (portfolio_id) REFERENCES trading.portfolios(id) ON DELETE RESTRICT,
    CONSTRAINT chk_orders_side CHECK (side IN ('BUY','SELL')),
    CONSTRAINT chk_orders_type CHECK (order_type IN ('MARKET','LIMIT'))
);

CREATE INDEX IF NOT EXISTS idx_orders_strategy_id ON trading.orders(strategy_id);
CREATE INDEX IF NOT EXISTS idx_orders_portfolio_id ON trading.orders(portfolio_id);
CREATE INDEX IF NOT EXISTS idx_orders_symbol_submitted_at ON trading.orders(symbol, submitted_at DESC);
CREATE INDEX IF NOT EXISTS idx_orders_status ON trading.orders(status);

-- ----------------------------
-- trading.trades
-- ----------------------------
CREATE TABLE IF NOT EXISTS trading.trades (
    id                UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    order_id          UUID NOT NULL,
    symbol            VARCHAR(20) NOT NULL,
    side              VARCHAR(10) NOT NULL, -- BUY/SELL
    executed_qty      BIGINT NOT NULL CHECK (executed_qty > 0),
    executed_price    NUMERIC(20,8) NOT NULL CHECK (executed_price > 0),
    executed_at       TIMESTAMPTZ NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_trades_order
      FOREIGN KEY (order_id) REFERENCES trading.orders(id) ON DELETE CASCADE,
    CONSTRAINT chk_trades_side CHECK (side IN ('BUY','SELL'))
);

CREATE INDEX IF NOT EXISTS idx_trades_order_id ON trading.trades(order_id);
CREATE INDEX IF NOT EXISTS idx_trades_symbol_executed_at ON trading.trades(symbol, executed_at DESC);

-- ----------------------------
-- Helpful comments
-- ----------------------------
COMMENT ON SCHEMA auth IS 'Authentication and identity domain';
COMMENT ON SCHEMA trading IS 'Trading simulation domain data';
