package com.lsx.demo;

public class HelloSpeaker implements IHello {

	@Override
	public String getHello(String name) {
		//������־�Ŀ�ʼ
		return "hello," + name;
		//��ǰreturn�Ľ�����ᱻ����afterReturning()������ȥ
		//���������ĳ����У���Ȼ�л���ȥ����ҵ��ķ���ֵ
		//���� ���������ֵ��ʲô������־�Ľ�����
	}

}
