package com.lsx.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student)ac.getBean("stu");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		//------------------------------------
		Student s2 = (Student)ac.getBean("stu2");
		System.out.println(s2.getTime());
		//----------------------------
		Student s3 = (Student)ac.getBean("stu3");
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		
	}

}
