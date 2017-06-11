package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Around("execution(* com.lsx.demo.IHello.*(..))")
	public Object invoke(ProceedingJoinPoint joinPoint){
		logger.log(Level.INFO,"method start..." + joinPoint.getSignature().getName());
		Object result = null;
		try {
			result = joinPoint.proceed();//�˴�������Ŀ�귽��
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("����ִ�к󷵻�ֵ��:" + result);
		logger.log(Level.INFO,"method end..." + joinPoint.getSignature().getName());
		System.out.println("����ֵ���޸�....");
		result = "Hello,Wrold..";
		return result;
	}
}
