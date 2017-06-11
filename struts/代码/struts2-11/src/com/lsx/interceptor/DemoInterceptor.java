package com.lsx.interceptor;

import java.util.Map;

import com.lsx.bean.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * ������������Ȩ�޵���֤
 * 	�������ĳ���û��Ļ����ſ���ȥ�鿴Ȩ��
 */
public class DemoInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//�Ȼ�ȡ��session����map���ͣ������session�����д��Ÿղŵ�¼ʱ��user
		Map sessionMap = ActionContext.getContext().getSession();
		//�ж�ʱ���������
		if ( "admin".equals(((Users)sessionMap.get("user")).getUsername())) {
			//����ִ��action�Ľ����invocation.invoke()��ʾִ��action
			return invocation.invoke();
		}
		//����ʾ��Ϣ����request��
		ActionContext.getContext().put("msg", "�Բ�����û��Ȩ�޲鿴");
		return "input";
	}

}
