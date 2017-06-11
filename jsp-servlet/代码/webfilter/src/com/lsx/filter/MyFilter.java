package com.lsx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 1.服务器启动的时候调用init(FilterConfig arg0)初始化
 * 2.根据web.xml中的过滤规则进行过滤，如满足规则进行过滤，
 */
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("过滤器的销毁");

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("过滤器的过滤");
		chain.doFilter(req, res);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("过滤器的初始化");

	}

}
