package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action2 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Action2¥¶¿Ì«Î«Û");
		return SUCCESS;
	}
}
