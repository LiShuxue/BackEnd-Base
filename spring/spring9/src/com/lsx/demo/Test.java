package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ʹ��Advisor�����ú󣬻�ȡ�Ľ���һ���������(��װ�õģ���Ϊʹ����aop)
		IHello helloProxy = (IHello)ac.getBean("helloSpeaker");
		helloProxy.hello("zhangsan");
	}

}
