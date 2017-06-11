package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ����̬������beanʵ������ȡ����
		//��Ϊ���Bean������ָ����factory-method,�����·���ȡ����IMusicBoxʵ�� 
		IMusicBox box = (IMusicBox)context.getBean("musicBox");
		box.play();
		
		//ͨ��������beanʵ������ȡ����
		ISome some = (ISome)context.getBean("some");
		some.show();
		
	}

}
