package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Action1¥¶¿Ì«Î«Û");
		return SUCCESS;
	}
}
