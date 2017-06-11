package com.lsx.action;

import com.lsx.service.IUserService;
import com.lsx.service.UserService;

/**
 * ����Ŀ�������������һ����ͨ��java��
 */
public class LoginAction {
	
	private IUserService service = new UserService();
	
	//�����������ԣ����ǵ����ֺ�ҳ��index���ؼ�����ͬ,get/set����
	private String username;
	private String password;
	
	public String login() {
		//��ǰ��ҪgetParameter�������ֵ�����ڲ��ã��Զ��ᱣ����������������
		if(service.login(username, password)) {
			return "ok";  //���ص�����ַ���ʵ������һ���߼���ͼ������struts�е�<result name="">��Ӧ
		}
		return "error";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
