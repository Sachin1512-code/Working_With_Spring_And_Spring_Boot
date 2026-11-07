package com.kodewala01.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kodewala01.Bean.Employee;
import com.kodewala01.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
      // we will tell to application for application configuration ::
	  
		
     // Start the container	
	 ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	 
	  
	 /*  Explain of ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	  * 
	  *  ApplicationContext -> interface use work with Spring
	  *  context --> Reference :
	  *  
	  *  
	  *  new AnnotationConfigApplicationContext() --> object of 
	  * 
	  *  AppConfig.class -> class name where my .java configuration is written filename follow by .class
	  *  
	  *  
	  *  
	  * 
	  * 
	  */
	 
	  // we will access using configuration file  , if we not give the name to bean it will take mathod name as defualt name '
	
	  //                                 if u want to give name @Bean(name="nameoftheBean");
	 
	  // give the bean with the id as specified 
	  
	 
	  Employee emp  =context.getBean("empObj" , Employee.class);
	  System.out.println(emp);
	 
	  //close the  continer  ::
	                               	  
	  ((AbstractApplicationContext) context).close();
	}
}
