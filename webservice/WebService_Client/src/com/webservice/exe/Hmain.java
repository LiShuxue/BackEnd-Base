package com.webservice.exe;

import java.util.List;

import com.webservice.service.Book;
import com.webservice.service.User;
import com.webservice.service.impl.Hello;

public class Hmain {
	public static void main(String[] args) {
		//�ӿڵ�ʵ����Ķ���
		Hello hello  = new Hello();
		//�ӿ����͵Ķ���
		com.webservice.service.Hello hello2 = hello.getHelloImplPort();
		
		System.out.println(hello2.sayHello("����"));
		  
		  List<Book> books=hello2.getBooksByUser(new User(20,"����","123456"));
		  
		  for (int i = 0; i < books.size(); i++) {
			  System.out.println(books.get(i).getName());
			
		}
	}
}
