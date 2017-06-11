package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction1 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐ DemoAction1");
		return SUCCESS;
	}

	
}
