package com.lsx.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {
	
	//查看机密信息的时候执行这个action
	@Override
	public String execute() throws Exception {
		//生成机密信息
		List<String> list = new ArrayList<String>();
		list.add("机密1");
		list.add("机密2");
		list.add("机密3");
		//将此机密信息集合保存在request中，用于跳转到显示页面的时候去显示
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
}
