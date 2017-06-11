package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	// Ŀ�����
	private Object target;
	DogInterceptor di = new DogInterceptor();

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;

		di.method1();

		// ���Ի�ȡ��Ŀ����������㣨������;
		result = method.invoke(target, args);

		di.method2();
		return result;
	}
}
