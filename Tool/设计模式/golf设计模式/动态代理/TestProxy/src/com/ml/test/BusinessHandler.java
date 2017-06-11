package com.ml.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 业务代理类
 * 
 * @author Administrator
 * 
 */
public class BusinessHandler implements InvocationHandler {

	private Object object = null;

	public BusinessHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("do something before method");
		Object ret = method.invoke(this.object, args);
		System.out.println("do something after method");
		return ret;

	}
}
