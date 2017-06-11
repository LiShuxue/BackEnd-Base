package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

//通过注解来实现切入

@Aspect
public class LogAfterAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@After("execution(* com.lsx.demo.IHello.*(..))")
	public void after(JoinPoint joinPoint){
		logger.log(Level.INFO,"method end..." + joinPoint.getSignature().getName());
	}
}
