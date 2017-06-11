package com.lsx.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet�������ڣ�
 * Servlet�ڵ�һ�α����ʵ�ʱ�򣬼���Servlet��ʵ�������󡢵���ʼ������init
 * ֮���ÿ�η��ʽ���ֻ������Ĵ���
 * ���������رյ�ʱ�򣬻�����е�Servlet��������
 * �������������еĹ����У���ֻ��ά��һ��Servlet��ʵ���������ʵ�������������û�������
 * ÿһ���û����ʷ��������������ͻ�Ϊ���û�����һ���µ��̣߳�Ҳ����˵�����е��̹߳���һ��Servlet
 * ��Servlet�ﲻ��ȥ����������ԣ������ᷢ����������
 */
public class DemoServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//������Ҫ��ʼ��ʲô�������Լ�ȥд������Ҫ������ȡĳ���ļ��ȵ�
		System.out.println("DemoServlet init");
	}
	
	@Override
	public void destroy() {
		//ֻ���������رշ�������ʱ��Ż�ִ�У�ǿ�˵�ʱ��ִ��
		//���������������дһЩ���ݣ�ȥ�ر�һЩ��ʲô�ģ����ǽ�����ʱ����Ҫִ��ʲô����д��������
		System.out.println("DemoServlet destroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DemoServlet get������");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DemoServlet post������");
	}
}
