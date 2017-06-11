package com.webservice.service;

import java.util.List;

import javax.jws.WebService;

import com.webservice.pojo.Book;
import com.webservice.pojo.User;

/*
 * 一个接口，里面有两个抽象方法
 * 要加WebService注解
 */
@WebService
public interface Hello {
	//传入名字，返回字符串
	public String sayHello(String name);
	//传入一个User对象，返回他有几本书
	public List<Book> getBooksByUser(User user);
}
