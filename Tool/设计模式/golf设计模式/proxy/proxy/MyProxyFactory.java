package com.proxy;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	public static Object getProxy(Object object) {
		ProxyHandler handler = new ProxyHandler();
		handler.setTarget(object);

		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), handler);

	}
}
