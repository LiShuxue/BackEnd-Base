package com.lsx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 1.������������ʱ�����init(FilterConfig arg0)��ʼ��
 * 2.����web.xml�еĹ��˹�����й��ˣ������������й��ˣ�
 */
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("������������");

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("�������Ĺ���");
		chain.doFilter(req, res);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("�������ĳ�ʼ��");

	}

}
