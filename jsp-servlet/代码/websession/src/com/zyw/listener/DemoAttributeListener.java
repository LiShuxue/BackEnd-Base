package com.zyw.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * HttpSessionAttributeListener 接口 ，在你向session中存储、修改、删除数据的时候，进行监听。
 * 		存储数据 时 调用 attributeAdded
 * 		删除数据时 调用 attributeRemoved
 * 		修改数据时 调用  attributeReplaced
 * @author Administrator
 *
 */
public class DemoAttributeListener implements HttpSessionAttributeListener {

	/**
	 * 向session中存一个新的数据时触发
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("向session中添加属性"+event.getName()+":"+event.getValue());
	}

	/**
	 * 在session中移除一个数据时触发
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("从session中移除属性"+event.getName());
	}

	/**
	 * 在修改session中数据时触发
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+"的值重新设置为"
				+event.getSession().getAttribute(event.getName()));
	}

}
