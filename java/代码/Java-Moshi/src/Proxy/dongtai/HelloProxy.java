package Proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements InvocationHandler {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;   //代表谁？
	
	/**
	 * 获得代理对象
	 */
	public Object bind(Object delegate) {
		this.delegate = delegate;
		//新产生的代理对象也是实现“源对象的所有接口”
		Object proxyObj = Proxy.newProxyInstance(delegate.getClass().getClassLoader(), 
				delegate.getClass().getInterfaces(), this);
		return proxyObj;
		
	}
	
	/**
	 * 调用代理对象的任意方法，都会执行当前invoke
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		logger.log(Level.INFO, "method start..." + method);
		//method是你调用的方法的对象
		//args方法参数  zhangsan
		//result 返回值，如果方法是void，result就是null
		Object result = method.invoke(proxy, args);//这个invoke（）跟上面的invoke（）不一样，这个invoke（）表示执行当前方法
		
		logger.log(Level.INFO, "method end..." + method);
		
		return result;
	}

}
