package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
	//定义一个切入点
	@Pointcut("execution(* com.lsx.demo.IHello.*(..))")
	private void logging(){}	//定义的切入点的别名  logging()

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Before("logging()")
	public void before(JoinPoint joinPoint){
		logger.log(Level.INFO,"method start..." + joinPoint.getSignature().getName());
	}
	
	/**
	 * 注解中使用了@AfterReturning的属性，切入点，和返回值
	 * 在HelloSpeaker的getHello()方法执行后，可以得到返回值
	 * @param joinPoint
	 * @param retVal 返回值，操作完后还会继续传出去
	 */
	@AfterReturning(pointcut="logging()",returning="retVal")
	public void afterReturning(JoinPoint joinPoint ,Object retVal){
		System.out.println("返回值是:" + retVal);
		logger.log(Level.INFO, "method end..." + joinPoint.getSignature().getName());
	}
}
