package com.lsx.demo;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterAdvice implements AfterReturningAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**
	 * ʵ��afterReturning��������ҵ�񷽷�֮�󣬲��빦��
	 */
	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2,
			Object arg3) throws Throwable {
		logger.log(Level.INFO, "method end...." + method);

	}

}
