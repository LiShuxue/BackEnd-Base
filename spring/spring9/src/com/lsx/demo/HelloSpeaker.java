package com.lsx.demo;

public class HelloSpeaker implements IHello {
	
	//������ Advice�е�before���ݣ���ִ�����ⷽ��֮ǰ
	@Override
	public void hello(String name) {
		System.out.println("Hello," + name);
	}

}
