package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

	/**
	 * ͨ�����������������ظ�Action
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("DemoAction ִ��");
		return SUCCESS;
	}

	
}
