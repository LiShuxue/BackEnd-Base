package com.lsx.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DemoActionContext extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//获取request  的Map，就是ActionContext本身
		ActionContext ac = ActionContext.getContext();
		//向request map中保存数据
		ac.put("name", "lisi");
		return SUCCESS;
	}

	public String other() throws Exception {
		//获取request  的Map，就是ActionContext本身
		ActionContext ac = ActionContext.getContext();
		//session map
		ac.getSession().put("session_name", "gaosong");
		//application map
		ac.getApplication().put("application_name", "haochen");
		return SUCCESS;
	}
	
}
