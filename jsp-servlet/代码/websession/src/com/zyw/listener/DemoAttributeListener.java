package com.zyw.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * HttpSessionAttributeListener �ӿ� ��������session�д洢���޸ġ�ɾ�����ݵ�ʱ�򣬽��м�����
 * 		�洢���� ʱ ���� attributeAdded
 * 		ɾ������ʱ ���� attributeRemoved
 * 		�޸�����ʱ ����  attributeReplaced
 * @author Administrator
 *
 */
public class DemoAttributeListener implements HttpSessionAttributeListener {

	/**
	 * ��session�д�һ���µ�����ʱ����
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("��session���������"+event.getName()+":"+event.getValue());
	}

	/**
	 * ��session���Ƴ�һ������ʱ����
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("��session���Ƴ�����"+event.getName());
	}

	/**
	 * ���޸�session������ʱ����
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+"��ֵ��������Ϊ"
				+event.getSession().getAttribute(event.getName()));
	}

}
