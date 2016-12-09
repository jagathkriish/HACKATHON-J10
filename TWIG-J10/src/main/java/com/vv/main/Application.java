package com.vv.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.vv.main","com.cg.models","com.cg.controller"})
//@EnableConfigurationProperties(AppProperties.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public HealthIndicator SpringOneHealthIndicator(){
		return ()->new Health.Builder().up().withDetail("message","SpringBootApp is running").build();
	}

}
