package com.kodewala01.config;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;

//import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.kodewala01.Bean.ClassWhoseObjetcCreated;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Lazy
	@Bean(name = "wmg")
	public ClassWhoseObjetcCreated wmgObj(@Value("${app.user}")String user) {
		System.out.println("AppConfig.wmgObj():: Creating the object...");
        
		// Create a Dependent Object
		LocalDateTime ldt = LocalDateTime.now();
		// Create a Target Object
		ClassWhoseObjetcCreated generator = new ClassWhoseObjetcCreated(ldt,user);
		return generator;
	}

}