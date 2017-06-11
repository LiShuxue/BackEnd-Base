package Test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.test.DogInterceptor;

/**
 * ��̬������
 * 
 * @author zjjlive
 * 
 */
public class ProxyHandler implements InvocationHandler {

	// Ŀ�����
	Object target;
	// ����������
	DogInterceptor interceptor = new DogInterceptor();

	// ͨ���˷������Զ�Ŀ������ʼ��
	public void setTarget(Object target) {
		this.target = target;
	}

	// ��̬������
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Object result = null;
		interceptor.method1();
		result = method.invoke(target, args);
		interceptor.method2();
		return result;
	}

}
