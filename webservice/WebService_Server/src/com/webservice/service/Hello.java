package com.webservice.service;

import java.util.List;

import javax.jws.WebService;

import com.webservice.pojo.Book;
import com.webservice.pojo.User;

/*
 * һ���ӿڣ��������������󷽷�
 * Ҫ��WebServiceע��
 */
@WebService
public interface Hello {
	//�������֣������ַ���
	public String sayHello(String name);
	//����һ��User���󣬷������м�����
	public List<Book> getBooksByUser(User user);
}
