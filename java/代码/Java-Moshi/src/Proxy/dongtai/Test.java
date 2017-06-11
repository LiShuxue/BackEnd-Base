package Proxy.dongtai;

public class Test {

	public static void main(String[] args) {
		HelloProxy proxy = new HelloProxy();
		IHello helloProxy = (IHello) proxy.bind(new HelloSpeaker());
		//当代理对象调用任意方法的时候，都会执行invoke()
		helloProxy.hello("zhangsan");
	}
}
