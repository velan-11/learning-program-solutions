package com.example.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingExecution {
   
	private static final Logger logger = LoggerFactory.getLogger(LoggingExecution.class);


	public static void main(String[] args) {
		
		 logger.error("This is an error message");
	        logger.warn("This is a warning message");
	}

}
