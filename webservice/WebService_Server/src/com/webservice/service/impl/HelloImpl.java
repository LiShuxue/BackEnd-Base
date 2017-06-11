package com.webservice.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.webservice.pojo.Book;
import com.webservice.pojo.User;
import com.webservice.service.Hello;
/*
 * 接口的实现类
 * 也要加注解
 */
@WebService(endpointInterface="com.webservice.service.Hello", serviceName="hello")
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		return "hello,"+name;
	}

	@Override
	public List<Book> getBooksByUser(User user) {
		//人工制造数据， 用来仿数据库操作。
		Map<User, List<Book>> map=new HashMap<User, List<Book>>();
		User user1=new User(1, "张三", "123456");
		User user2=new User(2, "李四", "123456");
		
		Book book=new Book(1,"西游记");
		Book book1=new Book(2,"三国");
		Book book2=new Book(3,"红楼梦");
		Book book3=new Book(4,"水浒");
		Book book4=new Book(5,"蜜月转");
		Book book5=new Book(6,"硕士生");
		
		List<Book> list=new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		List<Book> list2=new ArrayList<Book>();
		list2.add(book5);
		list2.add(book);
		
		map.put(user1, list);
		map.put(user2, list2);
		
		return map.get(user);
	}

}
