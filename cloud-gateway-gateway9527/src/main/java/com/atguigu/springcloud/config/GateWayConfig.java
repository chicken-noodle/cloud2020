package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routers = routeLocatorBuilder.routes();
        routers.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com")).build();

        routers.route("path_route_atguigu2",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com")).build();

        return routers.build();
    }
}


















