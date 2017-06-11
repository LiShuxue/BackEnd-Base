package com.ml.test;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// Ԫ����(���������)
		ManagerImpl managerImpl = new ManagerImpl();

		// ҵ�������
		BusinessHandler securityHandler = new BusinessHandler(managerImpl);

		// ��ô�����($Proxy0 extends Proxy implements Manager)��ʵ��.
		Manager managerProxy = (Manager) Proxy.newProxyInstance(managerImpl
				.getClass().getClassLoader(), managerImpl.getClass()
				.getInterfaces(), securityHandler);

		managerProxy.modify();
	}
}
