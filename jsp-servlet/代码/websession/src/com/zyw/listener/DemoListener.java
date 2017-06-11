package com.zyw.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 
 * HttpSessionListener �ӿڣ������Ự�Ĵ���������
 * �������Ựʱ Ĭ�ϵ��� sessionCreated����
 * �����ٻỰʱ Ĭ�ϵ��� sessionDestroyed����
 */
public class DemoListener implements HttpSessionListener {

	/**
	 * ������session����ʱִ��
	 */
	public void sessionCreated(HttpSessionEvent e) {
		//getServletContext() �õ�application
		//ÿһ���û��ķ��ʶ��ᴴ��һ���µ�session
		System.out.println("listener---create");
	}

	/**
	 * invalidate����sessionʱִ��
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("listener---destroy");
	}

}
