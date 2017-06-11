package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;

public class LogAspect {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void before(JoinPoint joinPoint){
		logger.log(Level.INFO,"method start..."+joinPoint.getSignature().getName());
	}
	
	public void afterReturning(JoinPoint joinPoint){
		logger.log(Level.INFO,"method end..." + joinPoint.getSignature().getName());
	}
}
