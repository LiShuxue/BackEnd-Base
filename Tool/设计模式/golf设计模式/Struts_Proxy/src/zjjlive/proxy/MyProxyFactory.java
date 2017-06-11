package zjjlive.proxy;

import java.lang.reflect.*;
/**
 * �������������Ŀ�����Ͷ�Ӧ�������������µĴ�����󣬴��������ķ�������Ŀ�귽������������������ϡ�
 * ͨ�����ַ�ʽ��ʵ������Ŀ�귽��֮ǰ��֮���Զ�����������������Ŀ�ġ�
 * @author Administrator
 *
 */
public class MyProxyFactory {
	/**
	 * ʵ��Service����
	 * 
	 * @param serviceName
	 *            String
	 * @return Object
	 */
	public static Object getProxy(Object object) {
		// Dog������ ����Ĳ�����
		ProxyHandler handler = new ProxyHandler();
		// �Ѹ�dogʵ���и����������
		handler.setTarget(object);
		// ��һ���������������� ��̬���� ��ClassLoader����ֻҪ�ö����ܷ���Dog�ӿڼ��ɡ�
		// �ڶ��������ǽӿ����飬���Ǵ���ýӿڵ�����
		// �����������Ǵ�������Ĵ���ʵ��
		//�������ݽӿ����鶯̬����������ʵ�����ӿ�����ͨ��object.getClass().getInterfaces()��ã�
		//�����Ĵ�������JVM���ڴ��ж�̬�����ģ�����ʵ�ִ��������ӿ������ȫ���ӿڡ���ˣ���̬����Ҫ��
		//������ı����ǽӿڵ�ʵ���࣬�����޷�Ϊ�乹����Ӧ�Ķ�̬ʵ��
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), handler);
	}
}