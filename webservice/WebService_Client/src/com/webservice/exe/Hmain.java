package com.webservice.exe;

import java.util.List;

import com.webservice.service.Book;
import com.webservice.service.User;
import com.webservice.service.impl.Hello;

public class Hmain {
	public static void main(String[] args) {
		//接口的实现类的对象
		Hello hello  = new Hello();
		//接口类型的对象
		com.webservice.service.Hello hello2 = hello.getHelloImplPort();
		
		System.out.println(hello2.sayHello("张三"));
		  
		  List<Book> books=hello2.getBooksByUser(new User(20,"张三","123456"));
		  
		  for (int i = 0; i < books.size(); i++) {
			  System.out.println(books.get(i).getName());
			
		}
	}
}
