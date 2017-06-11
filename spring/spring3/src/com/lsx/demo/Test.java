package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过静态工厂的bean实例来获取对象
		//因为这个Bean的配置指定了factory-method,所以下方获取的是IMusicBox实例 
		IMusicBox box = (IMusicBox)context.getBean("musicBox");
		box.play();
		
		//通过工厂的bean实例来获取对象
		ISome some = (ISome)context.getBean("some");
		some.show();
		
	}

}
