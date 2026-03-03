#!/usr/bin/env bash
set -euo pipefail

SERVICE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
REPO_ROOT="$(cd "$SERVICE_DIR/../../.." && pwd)"

exec bash "$REPO_ROOT/scripts/gen-proto.sh"
