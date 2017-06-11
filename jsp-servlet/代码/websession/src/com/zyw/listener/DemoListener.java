package com.zyw.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 
 * HttpSessionListener 接口，监听会话的创建和销毁
 * 当创建会话时 默认调用 sessionCreated（）
 * 当销毁会话时 默认调用 sessionDestroyed（）
 */
public class DemoListener implements HttpSessionListener {

	/**
	 * 创建新session对象时执行
	 */
	public void sessionCreated(HttpSessionEvent e) {
		//getServletContext() 得到application
		//每一个用户的访问都会创建一个新的session
		System.out.println("listener---create");
	}

	/**
	 * invalidate销毁session时执行
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("listener---destroy");
	}

}
