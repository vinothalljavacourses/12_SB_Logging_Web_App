package com.vinothit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
	
	private Logger logger= LoggerFactory.getLogger(MessageController.class);
	
	
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		// Log Level hierarchy
		//TRACE > DEBUG > INFO > WARN > ERROR > FATAL
		
		logger.debug("This is debug message from welcome.....");
		logger.info("welcomeMsg() execution method is started.....");
		
		String msg="Welcome To Ashok IT...";
		
		logger.info("welcomeMsg() execution is ended.....");
		
		logger.warn("This is warning from welcome method....");
		
		// checking ArithmeticException Testing
		//int i = 10/0;
		
		
		// Exception Handling for avoiding application flow 
		try {
			int i=10/0;
		}catch(Exception e){
			logger.error("Error Occured in welcomeMsg : "+ e.getMessage());
		}
		
		
		
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		// Log Level hierarchy
		//TRACE > DEBUG > INFO > WARN > ERROR > FATAL
		
		logger.debug("This is debug message from greet.....");
		
		logger.info("greetMsg() execution method is started.....");
		String msg="Good Morning...";
		
		logger.warn("This is warning from greet method....");
		
		// checking NullPointerException testing
		//String s = null;
		//s.length();
		
		// Exception Handling for avoiding application flow 
		try {
			String s = null;
			s.length();
		}catch(Exception e){
			logger.error("Error Occured in greetMsg : "+ e.getMessage());
		}
		
		logger.info("greetMsg() execution is ended.....");
		
		return msg;
	}
	

}
