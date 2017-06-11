package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//使用Advisor的配置后，获取的将是一个代理对象(封装好的，因为使用了aop)
		IHello helloProxy = (IHello)ac.getBean("helloSpeaker");
		helloProxy.hello("zhangsan");
	}

}
