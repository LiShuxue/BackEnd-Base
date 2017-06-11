package Test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.test.DogInterceptor;

/**
 * 动态代理类
 * 
 * @author zjjlive
 * 
 */
public class ProxyHandler implements InvocationHandler {

	// 目标对象
	Object target;
	// 拦截器对象
	DogInterceptor interceptor = new DogInterceptor();

	// 通过此方法可以对目标对象初始化
	public void setTarget(Object target) {
		this.target = target;
	}

	// 动态代理方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Object result = null;
		interceptor.method1();
		result = method.invoke(target, args);
		interceptor.method2();
		return result;
	}

}
