package com.lsx.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *����ActionSupportʵ����Action ����
 *�����ṩ�˺ܶ෽��
 */

public class MyAction extends ActionSupport{

	//Ҫдһ����������ķ��������ֱ�ӵ���д�����execute����
	//�Ͳ�����struts.xml������Action��ʱ��ָ������method��
	//ֻҪ�����������ͻ�Ĭ�ϵĵ���execute()
	
	@Override
	public String execute() throws Exception {
		System.out.println("MyAction��������");
		return SUCCESS;
	}
}
