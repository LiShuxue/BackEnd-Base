package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 一个普通的Java类
 *
 */
public class LogBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * 这里就是一个普通java类，before自己随意起的名字，
	 * JoinPoint,getTarget()获取目标对象，getArgs()获取参数，getSignature()获取Pointcut签名信息
	 * joinPoint :可以没有这些个参数,
	 */
	public void before(JoinPoint joinPoint){
													//这些就是为了显示连接点的信息
		logger.log(Level.INFO,"method start..." + joinPoint.getSignature().getName());
	}

}
