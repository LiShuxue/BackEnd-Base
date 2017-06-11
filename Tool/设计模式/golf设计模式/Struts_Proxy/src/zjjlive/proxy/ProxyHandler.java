package zjjlive.proxy;

import java.lang.reflect.*;

public class ProxyHandler implements InvocationHandler {
	private Object target;
	DogIntercepter di = new DogIntercepter();

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Exception {
		Object result = null;
		if (method.getName().equals("info")) {
			di.method1();
			result = method.invoke(target, args);
			di.method2();
		} else {
			result = method.invoke(target, args);
		}
		return result;
	}

	public void setTarget(Object o) {
		this.target = o;
	}
}
