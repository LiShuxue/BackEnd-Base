package com.lsx.action;

import com.lsx.bean.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	//ͨ��������ģʽȥ��ȡ�����������Ҫ�Դ�user��������get/set����
	private Users user = new Users();
	
	//actionִ�еľ������
	@Override
	public String execute() throws Exception {
		//�ж��û��������Ƿ���Ϲ涨�����ϾͿ��Ե�¼
		if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword())
				|| "lisi".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			
			//��¼��ʱ���Ƚ����user�������session�С�ActionContext.getContext()���Ի���������request��map���ͣ�
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
		//����û���������󣬵�¼ʧ�ܣ���ת����¼ҳ�棬����ʾ��ʾ��Ϣ
		ActionContext.getContext().put("msg", "�û������������");
		return INPUT;
	}
	
	public void setUser(Users user) {
		this.user = user;
	}
	
	public Users getUser() {
		return user;
	}
}
