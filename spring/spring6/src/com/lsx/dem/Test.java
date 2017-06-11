package com.lsx.dem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageManager mm = (MessageManager)ac.getBean("messageManager");
		
		try{
			mm.display();
			Thread.sleep(1000);
			mm.display();
			Thread.sleep(1000);
			mm.display();
			Thread.sleep(1000);
			mm.display();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
