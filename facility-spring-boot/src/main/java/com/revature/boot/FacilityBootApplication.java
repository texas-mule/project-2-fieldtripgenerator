package com.revature.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.revature.boot.*"})
public class FacilityBootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FacilityBootApplication.class, args);
	}

}
