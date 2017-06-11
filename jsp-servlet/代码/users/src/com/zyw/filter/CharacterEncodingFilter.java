package com.zyw.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	private String characterEncoding;
	private boolean enabled;
	
	public void destroy() {
		characterEncoding = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		if (enabled && characterEncoding != null) {
			request.setCharacterEncoding(characterEncoding);
			response.setCharacterEncoding(characterEncoding);
		}
		chain.doFilter(request, response);
	}

	/** 初始化*/
	public void init(FilterConfig config) throws ServletException {
		//从web.xml中读取 <init-param> 配置的参数值，通过key
		characterEncoding = config.getInitParameter("characterEncoding");
		String enable = config.getInitParameter("enable");
		enabled = "true".equalsIgnoreCase(enable.trim()) || "1".equalsIgnoreCase(enable.trim());
	}

}
