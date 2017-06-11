package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		IHello helloProxy = (IHello)ac.getBean("helloSpeaker");
		System.out.println(helloProxy.getHello("zhangsan"));
	}

}
