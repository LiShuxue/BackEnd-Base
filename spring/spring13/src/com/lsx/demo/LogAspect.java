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
	//����һ�������
	@Pointcut("execution(* com.lsx.demo.IHello.*(..))")
	private void logging(){}	//����������ı���  logging()

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Before("logging()")
	public void before(JoinPoint joinPoint){
		logger.log(Level.INFO,"method start..." + joinPoint.getSignature().getName());
	}
	
	/**
	 * ע����ʹ����@AfterReturning�����ԣ�����㣬�ͷ���ֵ
	 * ��HelloSpeaker��getHello()����ִ�к󣬿��Եõ�����ֵ
	 * @param joinPoint
	 * @param retVal ����ֵ��������󻹻��������ȥ
	 */
	@AfterReturning(pointcut="logging()",returning="retVal")
	public void afterReturning(JoinPoint joinPoint ,Object retVal){
		System.out.println("����ֵ��:" + retVal);
		logger.log(Level.INFO, "method end..." + joinPoint.getSignature().getName());
	}
}
