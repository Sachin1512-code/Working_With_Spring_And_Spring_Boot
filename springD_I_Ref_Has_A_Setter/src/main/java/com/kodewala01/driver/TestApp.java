package com.kodewala01.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.kodewala01.Bean.ClassWhoseObjetcCreated;
import com.kodewala01.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

	      ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);                              	  
	      
	      
	      //Working with bean created by IOC
	      ClassWhoseObjetcCreated wmg = context.getBean("wmg", ClassWhoseObjetcCreated.class);
		  System.out.println(wmg);
		  
		  
		  String status = wmg.wishMessage("sachin");
		  System.out.println(status);
	      
	      ((AbstractApplicationContext) context).close();
	}
}
