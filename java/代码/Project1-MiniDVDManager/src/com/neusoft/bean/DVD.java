package com.neusoft.bean;

import java.sql.Date;
/**
 *	DVD类	
 *	包含属性、属性封装get/set方法、有参/无参构造
 *	这就是Java中的实体类（JavaBean、POJO）
 */
public class DVD {

	private Integer id;			//编号
	private String name;	    //名称
	private Integer state;	   //借出状态
	private	Date time;		   //借出时间
	private Integer count;		//借出次数
	private Integer isDel;	    //是否删除
	
	public DVD() {
		super();
	}

	public DVD(Integer id, String name, Integer state, Date time,
			Integer count, Integer isDel) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.time = time;
		this.count = count;
		this.isDel = isDel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	
}
