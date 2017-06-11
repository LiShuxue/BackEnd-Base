package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	private Object tartet;
	DogInterceptor di = new DogInterceptor();

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		di.method1();
		result = method.invoke(tartet, args);
		di.method2();
		return result;
	}

	public void setTartet(Object tartet) {
		this.tartet = tartet;
	}

}
