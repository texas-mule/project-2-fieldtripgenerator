package com.revature.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.revature.boot.*"})
public class FacilityBootApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FacilityBootApplication.class).properties("spring.config.name: facility-app");
	}
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "facility-app");
		SpringApplication.run(FacilityBootApplication.class, args); 
	}

}
