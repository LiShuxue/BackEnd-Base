package com.lsx.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorB extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("InterceptorB start。。。。");
		String result = invocation.invoke();
		System.out.println("InterceptorB end。。。。");
		return result;
	}
}
