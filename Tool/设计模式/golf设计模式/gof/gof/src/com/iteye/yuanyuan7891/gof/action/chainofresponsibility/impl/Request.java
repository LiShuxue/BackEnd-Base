package com.iteye.yuanyuan7891.gof.action.chainofresponsibility.impl;
public class Request{
	private String type;
	public Request() {
		super();
	}
	public Request(String type){this.type=type;}
	public String getType(){return type;}
	public void execute(){
	//request 真正具体行为代码
	}
	}