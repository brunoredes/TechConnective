package com.bandtec.techconnective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.techconnective")
@SpringBootApplication
public class TechconnectiveApplication extends SpringBootServletInitializer{
	
	private static Class TechconnectiveApplicationClass = TechconnectiveApplication.class;

	public static void main(String[] args) {

		SpringApplication.run(TechconnectiveApplication.class, args);
	}

}
