package com.cts.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cts.security.filters.ErrorFilter;
import com.cts.security.filters.Postfilter;
import com.cts.security.filters.Prefilter;
import com.cts.security.filters.RouteFilter;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class SecurityMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityMicroserviceApplication.class, args);
	}
	
	@Bean
	public Prefilter prefilter() {
		return new Prefilter();
	}
	
	@Bean
	Postfilter postFilter() {
		return new Postfilter();
	}
	
	@Bean
	RouteFilter routeFilter() {
		return new RouteFilter();
	}
	
	@Bean 
	ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

}
