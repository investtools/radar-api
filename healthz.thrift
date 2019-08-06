namespace rb Radar.Api
namespace java br.com.investtools.radar.api

enum HealthStatus {
  HEALTHY, UNHEALTHY
}

service Healthz {
  HealthStatus status()
}
