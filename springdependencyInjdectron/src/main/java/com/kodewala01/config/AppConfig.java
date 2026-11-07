package com.kodewala01.config;

// 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.kodewala01.Bean.Employee;

/*
 *    -->> first need tell to ioc that this my configuration file in pure we need to use "@configuration" in anotation form 
 *    
 *       >
 * 
 * 
 * 
 * 
 */

@Configuration // this means  
public class AppConfig {
        static {
        	System.out.println("AppConfig. Static block  is loading\n");
        }

		public AppConfig() {
			super();
			System.out.println("AppConfig  object is created\n");
		}
		
		
		// we have to tell to ioc--> this the method which is a bean :: using @Bean
		// 
		@Bean
		public Employee empObj() {
			// when we got with java_configuration we have to it manuually ::
			Employee emp = new Employee();
			emp.setEid(1);
			emp.setEage(22);
			emp.setEname("Sachin");
			emp.setEaddress("Indore");
			return emp;
		}
        
        
}

/*
 * 
 *                                             @Bean
		                                      public Employee empObj() {
			                                    // when we got with java_configuration we have to it manuually ::
			                                    Employee emp = new Employee();
			                                    emp.setEid(1);
			                                    emp.setEage(22);
			                                    emp.setEname("Sachin");
			                                    emp.setEaddress("Indore");
			                                    return emp;
		                                       }
 *                                            
 *                                            Internally IOC cONTAINER HAVE THIS::
 *                                            
 *                                            
 *                                            IOC:Cache ::  IT Will link the  Employee with empObj --> 
 *                                                          Employee it have acess to location it cannot access beyond the accesss::
 *                                                          
 *                                                          so get we acess with empObj::
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/