package com.lsx.demo;


public class HelloSpeaker implements IHello {

	/**
	 * �ҵ�ҵ�񷽷�������Ҫͨ�������ӿڣ���÷���ִ�е�ǰ�󣬼�����־
	 */
	@Override
	public void hello(String name) {
		System.out.println("Hello," + name);
	}

}
