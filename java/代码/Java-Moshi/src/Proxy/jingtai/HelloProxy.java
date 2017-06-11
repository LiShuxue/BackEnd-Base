package Proxy.jingtai;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * ��ǰ��HelloProxyֻ��ȥ����ʵ��IHello�ӿڵĶ���
 * ���Ҵ�HelloProxyҲ��Ҫʵ�ָýӿ�
 *
 */
public class HelloProxy implements IHello {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private IHello helloObject;
	
	public HelloProxy(IHello hello) {
		this.helloObject = hello;
	}
	
	@Override
	public void hello(String name) {
		logger.log(Level.INFO, "��־��ʼ������");
		helloObject.hello(name);
		logger.log(Level.INFO, "��־����������");

	}

}
