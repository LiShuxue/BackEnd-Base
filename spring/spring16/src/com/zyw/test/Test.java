package com.zyw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyw.bean.Demo1User;
import com.zyw.dao.IUserDAO;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserDAO userDAO = (IUserDAO)ac.getBean("userDAOProxy");
		//IUserDAO userDAO = (IUserDAO)ac.getBean("userDAO");
		Demo1User user = new Demo1User("zz", 22);
		userDAO.insert(user);
		
		/*Demo1User queryUser = userDAO.find(1);
		System.out.println(queryUser.getName());*/
	}

}
