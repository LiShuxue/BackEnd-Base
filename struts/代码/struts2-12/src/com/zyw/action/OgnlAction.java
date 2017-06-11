package com.zyw.action;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zyw.entity.Person;

public class OgnlAction extends ActionSupport {

	private List<Person> persons;
	private String username;
	private String password;

	//OGNL调用该方法，必须静态，有返回值
	public static String staticOgnl(String name){
		return "ognl test!!!Hello:"+name;
	}
	
	
	public String ognlTest() throws Exception {
		//1.Action中的属性默认存储到请求范围
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("msg", "application信息");
		ctx.getSession().put("msg", "seesion信息");
		ctx.put("msg", "request信息");
		/*HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "request信息");*/
		
		persons = new LinkedList<Person>();
		Person p1 = new Person("p1",26,new Date());
		Person p2 = new Person("p2", 36, new Date());
		Person p3 = new Person("p3", 16, new Date());
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		return SUCCESS;
	}


	public List<Person> getPersons() {
		return persons;
	}


	public void setPersons(List<Person> persons) {
		this.persons = persons;
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
