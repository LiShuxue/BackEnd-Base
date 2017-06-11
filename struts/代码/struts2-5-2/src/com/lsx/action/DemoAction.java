package com.lsx.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 通过接口 获取 request、session、application 范围的Map
 * 
 * 实现接口，通过接口方法为属性赋值的形式  得到Map
 * 不是必须实现3个，用哪个实现哪个
 *
 */
public class DemoAction extends ActionSupport 
		implements RequestAware,SessionAware,ApplicationAware{

	//用以下的属性来保存指定范围的 map对象
	//在接口方法中去写代码，赋值。
	//接口方法的执行，会在处理请求之前完成
	private Map req;
	private Map sess;
	private Map app;
	
	@Override
	public String execute() throws Exception {
		//处理请求的时候，我就可以使用这3个属性了。
		req.put("req_msg", "request范围的数据");
		sess.put("sess_msg", "session范围的数据");
		app.put("app_msg", "application范围的数据");
		
		//获取
		System.out.println(req.get("req_msg"));
		System.out.println(sess.get("sess_msg"));
		System.out.println(app.get("app_msg"));
		
		return null;	//之后不执行了。
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
