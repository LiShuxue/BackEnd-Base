package com.lsx.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 盛舜匂A
 * @author Administrator
 *
 */
public class InterceptorA extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("InterceptorA start。。。。");
		String result = invocation.invoke();
		System.out.println("InterceptorA end。。。。");
		return result;
	}

}
