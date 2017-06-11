package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

	public String m1() throws Exception {
		System.out.println("Ö´ÐÐm1");
		return SUCCESS;
	}

	public String m2() throws Exception {
		System.out.println("Ö´ÐÐm2");
		return SUCCESS;
	}

	public String m3() throws Exception {
		System.out.println("Ö´ÐÐm3");
		return SUCCESS;
	}
		
}
