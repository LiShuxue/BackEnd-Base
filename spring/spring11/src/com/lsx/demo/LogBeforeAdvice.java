package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Before("execution(* com.lsx.demo.IHello.*(..))")
	public void before(JoinPoint joinPoint){
		logger.log(Level.INFO,"method start...."+joinPoint.getSignature().getName());
	}
}
