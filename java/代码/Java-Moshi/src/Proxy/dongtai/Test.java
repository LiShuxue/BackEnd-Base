package Proxy.dongtai;

public class Test {

	public static void main(String[] args) {
		HelloProxy proxy = new HelloProxy();
		IHello helloProxy = (IHello) proxy.bind(new HelloSpeaker());
		//���������������ⷽ����ʱ�򣬶���ִ��invoke()
		helloProxy.hello("zhangsan");
	}
}
