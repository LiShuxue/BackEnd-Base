package com.lsx.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptor implements MethodInterceptor{
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		logger.log(Level.INFO, "method start...." + methodInvocation.getMethod());
		Object result = null;
		try {
			result = methodInvocation.proceed();//执行拦截的方法
		} finally {
			logger.log(Level.INFO, "method end...." + methodInvocation.getMethod());
		}
		return result;
	}

}
