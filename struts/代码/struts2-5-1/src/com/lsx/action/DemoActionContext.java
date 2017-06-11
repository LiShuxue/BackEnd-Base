package com.lsx.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DemoActionContext extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//��ȡrequest  ��Map������ActionContext����
		ActionContext ac = ActionContext.getContext();
		//��request map�б�������
		ac.put("name", "lisi");
		return SUCCESS;
	}

	public String other() throws Exception {
		//��ȡrequest  ��Map������ActionContext����
		ActionContext ac = ActionContext.getContext();
		//session map
		ac.getSession().put("session_name", "gaosong");
		//application map
		ac.getApplication().put("application_name", "haochen");
		return SUCCESS;
	}
	
}
