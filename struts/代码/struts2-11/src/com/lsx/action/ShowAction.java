package com.lsx.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {
	
	//�鿴������Ϣ��ʱ��ִ�����action
	@Override
	public String execute() throws Exception {
		//���ɻ�����Ϣ
		List<String> list = new ArrayList<String>();
		list.add("����1");
		list.add("����2");
		list.add("����3");
		//���˻�����Ϣ���ϱ�����request�У�������ת����ʾҳ���ʱ��ȥ��ʾ
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
}
