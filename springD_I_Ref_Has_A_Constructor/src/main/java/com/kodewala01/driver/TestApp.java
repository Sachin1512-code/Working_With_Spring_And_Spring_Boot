package com.kodewala01.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.kodewala01.Bean.ClassWhoseObjetcCreated;
import com.kodewala01.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		
		 // System.setProperty("app.user", "Sachin"); 
		  
	      ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);                              	  
	      
	      
	      //Working with bean created by IOC
	      ClassWhoseObjetcCreated wmg = context.getBean(ClassWhoseObjetcCreated.class, "Suraj");
		  
	      System.out.println(wmg);
		  
	      String sta = wmg.wishMessage();
	      System.out.println("TestApp.main() " + sta);
	      
	      ((AbstractApplicationContext) context).close();
	}
}
