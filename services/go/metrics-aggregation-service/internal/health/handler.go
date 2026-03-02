package health

import (
	"encoding/json"
	"net/http"
	"time"
)

func Register(mux *http.ServeMux, serviceName string) {
	mux.HandleFunc("/health/live", func(w http.ResponseWriter, r *http.Request) {
		writeJSON(w, http.StatusOK, map[string]any{
			"status":    "UP",
			"service":   serviceName,
			"timestamp": time.Now().UTC().Format(time.RFC3339Nano),
		})
	})

	mux.HandleFunc("/health/ready", func(w http.ResponseWriter, r *http.Request) {
		writeJSON(w, http.StatusOK, map[string]any{
			"status":    "UP",
			"service":   serviceName,
			"timestamp": time.Now().UTC().Format(time.RFC3339Nano),
		})
	})
}

func writeJSON(w http.ResponseWriter, code int, payload map[string]any) {
	w.Header().Set("Content-Type", "application/json")
	w.WriteHeader(code)
	_ = json.NewEncoder(w).Encode(payload)
}
