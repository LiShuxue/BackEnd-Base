package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("MyAction��������");
		return SUCCESS;
	}
	
	public String add() throws Exception {
		System.out.println("add��������");
		return SUCCESS;
	}
	
	public String query() throws Exception {
		System.out.println("query��������");
		return SUCCESS;
	}
}
