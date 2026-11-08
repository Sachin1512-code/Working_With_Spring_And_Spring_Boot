package com.kodewala01.config;

import java.time.LocalDateTime;

//import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala01.Bean.ClassWhoseObjetcCreated;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	
	
	@Bean(name = "wmg")
	public ClassWhoseObjetcCreated wmgObj() {
		System.out.println("AppConfig.wmgObj():: Creating the object...");

		// Create a Target Object
		ClassWhoseObjetcCreated generator = new ClassWhoseObjetcCreated();

		// Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		
		
		//linking the object using Setter style
		generator.setLdt(ldt);

		return generator;
	}

}