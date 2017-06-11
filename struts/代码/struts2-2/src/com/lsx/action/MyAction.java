package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("MyAction处理请求");
		return SUCCESS;
	}
	
	public String add() throws Exception {
		System.out.println("add处理请求");
		return SUCCESS;
	}
	
	public String query() throws Exception {
		System.out.println("query处理请求");
		return SUCCESS;
	}
}
