package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *父类ActionSupport实现了Action 方法
 *而且提供了很多方法
 */

public class MyAction extends ActionSupport{

	//要写一个处理请求的方法，如果直接的重写父类的execute方法
	//就不用在struts.xml中配置Action的时候指定属性method了
	//只要有请求来，就会默认的调用execute()
	
	@Override
	public String execute() throws Exception {
		System.out.println("MyAction处理请求");
		return SUCCESS;
	}
}
