package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		//通过spring来获取配置文件中为属性helloword赋的值
		//加载src下的xml
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得xml中配置的HelloBean对象，getBean参数就是xml中的id
		HelloBean hello1 = (HelloBean)context.getBean("helloBean");
		System.out.println(hello1.getHelloword());
		
		//若是不用spring的话,属性值还是原来的默认值
		HelloBean hello2 = new HelloBean();
		System.out.println(hello2.getHelloword());
		
		//spring默认bean 是单例的。输出第一个HelloBean对象,又输出一个新得到的HelloBean对象
		//在 <bean> 上使用属性   scope="prototype"  就取消单例
		System.out.println(hello1);
		System.out.println(context.getBean("helloBean"));
	}
}
