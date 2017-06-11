package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction extends ActionSupport implements ModelDriven<Users>{
	//该属性可以没有get/set方法
	private Users user = new Users();

	@Override
	public Users getModel() {
		//直接返回属性user
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("处理请求MyAction");
		//获取属性user 的属性 是否接收到表单的请求数据
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		return SUCCESS;
	}

}
