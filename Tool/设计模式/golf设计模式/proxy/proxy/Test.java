package com.proxy;

public class Test {
	public static void main(String[] args) {
		Dog dogTarget = new DogImpl();
		// 可能通过工厂getProxy对某一个对象实现动态代理
		Object proxy = MyProxyFactory.getProxy(dogTarget);

		Dog dog = null;

		if (proxy instanceof Dog) {
			dog = (Dog) proxy;
		}

		dog.info();
		dog.run();

	}
}
