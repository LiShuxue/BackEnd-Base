package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//得到代理对象
		ISome some = (ISome)ac.getBean("proxyFactoryBean");
		//System.out.println(some);
		//调用代理对象的方法，同时，先被OtherIntroduction的invoke 拦截
		some.doSome();
		
		//调用doOther()方法，再一次的被拦截
		//((IOther)some).doOther();
		IOther other = (IOther)some;//为什么可以转，因为在配置文件中规定了otherAdvice
		//System.out.println("xx:" + other);
		other.doOther();
		
	}

}
