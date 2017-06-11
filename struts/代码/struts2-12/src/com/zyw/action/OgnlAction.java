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

	//OGNL���ø÷��������뾲̬���з���ֵ
	public static String staticOgnl(String name){
		return "ognl test!!!Hello:"+name;
	}
	
	
	public String ognlTest() throws Exception {
		//1.Action�е�����Ĭ�ϴ洢������Χ
		
		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("msg", "application��Ϣ");
		ctx.getSession().put("msg", "seesion��Ϣ");
		ctx.put("msg", "request��Ϣ");
		/*HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "request��Ϣ");*/
		
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
