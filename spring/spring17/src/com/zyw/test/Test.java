package com.zyw.test;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;
import com.zyw.service.IUserService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserService s = (IUserService)ac.getBean("userService");

		Demo1User user = new Demo1User("zz", 22);
		s.insert(user);
		
		/*Demo1User queryUser = userDAO.find(1);
		System.out.println(queryUser.getName());*/
		
		
	}

}
