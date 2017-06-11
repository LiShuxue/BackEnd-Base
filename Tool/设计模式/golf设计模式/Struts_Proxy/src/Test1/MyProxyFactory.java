package Test1;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	public static Object getProxy(Object obj) {
		ProxyHandler ph = new ProxyHandler();
		ph.setTarget(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
				.getClass().getInterfaces(), ph);
	}
}
