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
 * �ӿڵ�ʵ����
 * ҲҪ��ע��
 */
@WebService(endpointInterface="com.webservice.service.Hello", serviceName="hello")
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		return "hello,"+name;
	}

	@Override
	public List<Book> getBooksByUser(User user) {
		//�˹��������ݣ� ���������ݿ������
		Map<User, List<Book>> map=new HashMap<User, List<Book>>();
		User user1=new User(1, "����", "123456");
		User user2=new User(2, "����", "123456");
		
		Book book=new Book(1,"���μ�");
		Book book1=new Book(2,"����");
		Book book2=new Book(3,"��¥��");
		Book book3=new Book(4,"ˮ�");
		Book book4=new Book(5,"����ת");
		Book book5=new Book(6,"˶ʿ��");
		
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
