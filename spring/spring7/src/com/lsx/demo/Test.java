package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*IHello hello = new HelloSpeaker();
		hello.hello("xiaoQiang");*/
		
		/*IHello helloProxy = (IHello)ac.getBean("helloProxy");
		helloProxy.hello("lisi");*/
		
		IHello helloProxy = (IHello)ac.getBean("interceptorProxy");
		helloProxy.hello("zhangsan");
	}

}
