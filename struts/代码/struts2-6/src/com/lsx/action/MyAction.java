package com.lsx.action;
import com.opensymphony.xwork2.ActionSupport;


public class MyAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("执行了默认的action ---  MyAction");
		return null;
	}
}
