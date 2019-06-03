package com.revature.boot;

import java.sql.DriverManager;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
	@BeforeClass
	public static void configSetUp() {
		System.setProperty("spring.config.name", "facility-app");
	}

	@Test
	public void contextLoads() {
	}

}
