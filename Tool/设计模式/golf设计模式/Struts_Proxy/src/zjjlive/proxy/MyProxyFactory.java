package zjjlive.proxy;

import java.lang.reflect.*;
/**
 * 代理工厂负责根据目标对象和对应的拦截器生成新的代理对象，代理对象里的方法就是目标方法和拦截器方法的组合。
 * 通过这种方式，实现了在目标方法之前或之后，自动调用拦截器方法的目的。
 * @author Administrator
 *
 */
public class MyProxyFactory {
	/**
	 * 实例Service对象。
	 * 
	 * @param serviceName
	 *            String
	 * @return Object
	 */
	public static Object getProxy(Object object) {
		// Dog控制类 代理的操作类
		ProxyHandler handler = new ProxyHandler();
		// 把该dog实例托付给代理操作
		handler.setTarget(object);
		// 第一个参数是用来创建 动态代理 的ClassLoader对象，只要该对象能访问Dog接口即可。
		// 第二个参数是接口数组，正是代理该接口的数组
		// 第三个参数是代理包含的处理实例
		//方法根据接口数组动态创建代理类实例，接口数组通过object.getClass().getInterfaces()获得，
		//创建的代理类是JVM在内存中动态创建的，该类实现传入参数里接口数组的全部接口。因此，动态代理要求
		//被代理的必须是接口的实现类，否则无法为其构造相应的动态实例
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), handler);
	}
}