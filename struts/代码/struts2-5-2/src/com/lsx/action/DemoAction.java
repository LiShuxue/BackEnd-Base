package com.lsx.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ͨ���ӿ� ��ȡ request��session��application ��Χ��Map
 * 
 * ʵ�ֽӿڣ�ͨ���ӿڷ���Ϊ���Ը�ֵ����ʽ  �õ�Map
 * ���Ǳ���ʵ��3�������ĸ�ʵ���ĸ�
 *
 */
public class DemoAction extends ActionSupport 
		implements RequestAware,SessionAware,ApplicationAware{

	//�����µ�����������ָ����Χ�� map����
	//�ڽӿڷ�����ȥд���룬��ֵ��
	//�ӿڷ�����ִ�У����ڴ�������֮ǰ���
	private Map req;
	private Map sess;
	private Map app;
	
	@Override
	public String execute() throws Exception {
		//���������ʱ���ҾͿ���ʹ����3�������ˡ�
		req.put("req_msg", "request��Χ������");
		sess.put("sess_msg", "session��Χ������");
		app.put("app_msg", "application��Χ������");
		
		//��ȡ
		System.out.println(req.get("req_msg"));
		System.out.println(sess.get("sess_msg"));
		System.out.println(app.get("app_msg"));
		
		return null;	//֮��ִ���ˡ�
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.app = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sess = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.req = request;
	}

	
}
