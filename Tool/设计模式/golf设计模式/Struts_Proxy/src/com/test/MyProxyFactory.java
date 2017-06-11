package com.test;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	public static Object getProxy(Object object) {
		ProxyHandler ph = new ProxyHandler();
		ph.setTartet(object);
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), ph);
	}
}
