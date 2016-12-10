package com.vv.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.models.Avbl_Repository;
import com.cg.models.Planner_Repository;
import com.cg.models.Traveller_Repository;

@SpringBootApplication
@ComponentScan({"com.vv.main","com.cg.models","com.cg"})
@EntityScan("com.cg.models")
@EnableJpaRepositories("com.cg.models")
//@EnableConfigurationProperties(AppProperties.class)
public class Application {
	
	private Planner_Repository planner_repository;
	private Traveller_Repository travel_repository;
	private Avbl_Repository avbl_repository;

	public Application(Traveller_Repository travel_repository,Planner_Repository planner_repository,Avbl_Repository avbl_repository) {
		this.planner_repository = planner_repository;
		this.travel_repository = travel_repository;
		this.avbl_repository = avbl_repository;
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public HealthIndicator SpringOneHealthIndicator(){
		return ()->new Health.Builder().up().withDetail("message","SpringBootApp is running").build();
	}

}
