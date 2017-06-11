package Proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements InvocationHandler {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;   //����˭��
	
	/**
	 * ��ô������
	 */
	public Object bind(Object delegate) {
		this.delegate = delegate;
		//�²����Ĵ������Ҳ��ʵ�֡�Դ��������нӿڡ�
		Object proxyObj = Proxy.newProxyInstance(delegate.getClass().getClassLoader(), 
				delegate.getClass().getInterfaces(), this);
		return proxyObj;
		
	}
	
	/**
	 * ���ô����������ⷽ��������ִ�е�ǰinvoke
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		logger.log(Level.INFO, "method start..." + method);
		//method������õķ����Ķ���
		//args��������  zhangsan
		//result ����ֵ�����������void��result����null
		Object result = method.invoke(proxy, args);//���invoke�����������invoke������һ�������invoke������ʾִ�е�ǰ����
		
		logger.log(Level.INFO, "method end..." + method);
		
		return result;
	}

}
