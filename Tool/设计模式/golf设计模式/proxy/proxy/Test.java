package com.proxy;

public class Test {
	public static void main(String[] args) {
		Dog dogTarget = new DogImpl();
		// ����ͨ������getProxy��ĳһ������ʵ�ֶ�̬����
		Object proxy = MyProxyFactory.getProxy(dogTarget);

		Dog dog = null;

		if (proxy instanceof Dog) {
			dog = (Dog) proxy;
		}

		dog.info();
		dog.run();

	}
}
