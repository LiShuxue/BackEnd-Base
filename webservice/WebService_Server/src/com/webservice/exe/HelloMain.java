package com.webservice.exe;

import javax.xml.ws.Endpoint;

import com.webservice.service.impl.HelloImpl;
/*
 * ��������Ŀ�ʼ�ࡣ
 */
public class HelloMain {
	public static void main(String[] args) {
		HelloImpl h= new HelloImpl();
		Endpoint.publish("http://192.168.0.161:8089/helloword", h);
		System.out.println("service ��������");
	}
}
