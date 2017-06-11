package com.lsx.action;

import com.lsx.bean.Stu;
import com.lsx.service.IStuService;
//注意导这个xwork2的包
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	
	//通过域驱动方式赋值，将页面上的值提取出来为这个对象赋值，页面控件的name=模型对象.属性名
	private Stu stu;
	private IStuService service;

	@Override
	public String execute() throws Exception {
		if(service.addStu(stu)) {
			return SUCCESS;
		}
		return INPUT;
	}
	
	public Stu getStu() {
		return stu;
	}
	
	public void setStu(Stu stu) {
		this.stu = stu;
	}
	
	public IStuService getService() {
		return service;
	}
	
	public void setService(IStuService service) {
		this.service = service;
	}
	
}
