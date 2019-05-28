package com.revature.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.revature.boot.*"})
public class FacilityBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacilityBootApplication.class, args);
	}

}
