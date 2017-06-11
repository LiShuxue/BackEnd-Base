package com.lsx.demo;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**
	 * ʵ�ֽӿں�ʵ�ָ�before������д��������Ҫ��ҵ�񷽷�֮ǰ����ĳ���
	 */
	@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		logger.log(Level.INFO, "method start...." + method);
		
	}
}
