package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

	/**
	 * 通过两个拦截器，拦截该Action
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("DemoAction 执行");
		return SUCCESS;
	}

	
}
