package com.lsx.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("Interceptor start。。。。");
		String result = invocation.invoke();
		System.out.println("Interceptor end。。。。");
		return result;
	}

}
