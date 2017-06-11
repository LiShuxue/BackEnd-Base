package com.lsx.demo;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**
	 * 实现接口后，实现该before，其中写入我们需要在业务方法之前插入的程序
	 */
	@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		logger.log(Level.INFO, "method start...." + method);
		
	}
}
