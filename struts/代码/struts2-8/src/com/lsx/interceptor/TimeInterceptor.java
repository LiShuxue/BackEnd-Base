package com.lsx.interceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CORBA.DynAnyPackage.Invalid;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TimeInterceptor implements Interceptor {

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	/**
	 * ���ĵ����ط���
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//�������DemoAction1 ����������֮ǰ ������֮�� ��������Ҫ�ӵĹ��ܡ�
		//�ⶼ��֮ǰ���¶�
		Logger logger = Logger.getLogger("TimeInterceptor");
		logger.log(Level.INFO,"DemoAction1Ҫ��ʼִ���ˡ�");
		//ִ��DemoAction1  ���õ������ص� �߼���ͼ ��
		String result = invocation.invoke();
		//������֮����¶�
		logger.log(Level.INFO, "DemoAction1 ִ�����ˣ����ص��߼���ͼ����:" + result);
		//��󷵻�  �߼���ͼ��
		return result;
	}

}








