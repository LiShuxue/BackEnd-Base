package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;

public class LogAfterAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void after(JoinPoint joinPoint){
		logger.log(Level.INFO,"method end..." + joinPoint.getSignature().getName());
	}
}
