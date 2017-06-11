package Proxy.jingtai;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 当前的HelloProxy只能去代理实现IHello接口的对象
 * 并且此HelloProxy也需要实现该接口
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
		logger.log(Level.INFO, "日志开始。。。");
		helloObject.hello(name);
		logger.log(Level.INFO, "日志结束。。。");

	}

}
