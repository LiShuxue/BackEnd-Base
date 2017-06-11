package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	// 目标对象
	private Object target;
	DogInterceptor di = new DogInterceptor();

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;

		di.method1();

		// 可以获取到目标对象的切入点（方法）;
		result = method.invoke(target, args);

		di.method2();
		return result;
	}
}
