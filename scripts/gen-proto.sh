#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
CONTRACTS_DIR="$ROOT_DIR/contracts"

if ! command -v buf >/dev/null 2>&1; then
  echo "error: 'buf' is not installed. Install from https://buf.build/docs/installation" >&2
  exit 1
fi

cd "$CONTRACTS_DIR"

# Ensure fresh generated output for deterministic builds.
rm -rf gen/java gen/go gen/python
mkdir -p gen/java gen/go gen/python

buf lint
buf breaking --against '.git#branch=main' || true
buf generate

echo "Proto generation complete:"
echo "  - $CONTRACTS_DIR/gen/java"
echo "  - $CONTRACTS_DIR/gen/go"
echo "  - $CONTRACTS_DIR/gen/python"
