package pe.goliva.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("student-service", r -> r.path("/api/student/**")
                        .uri("lb://STUDENT-SERVICE"))
                .route("course-service", r -> r.path("/api/courses/**")
                        .uri("lb://COURSE-SERVICE"))
                .route("enrollment-service", r -> r.path("/api/enrollments/**")
                        .uri("lb://ENROLLMENT-SERVICE"))
                .build();

    }

}
