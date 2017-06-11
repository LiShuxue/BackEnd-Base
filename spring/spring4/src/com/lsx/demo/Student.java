package com.lsx.demo;

import java.util.Date;

public class Student {

	private String name;
	private int age;
	private Date time;
	
	/**
	 * ���������Ĺ���
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * �޲ι���
	 */
	public Student() {
		super();
	}
	
	/**
	 * һ�������Ĺ���
	 */
	public Student(Date time){
		this.time = time;
	}
	
	/**
	 * һ�������Ĺ���
	 */
	public Student(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
