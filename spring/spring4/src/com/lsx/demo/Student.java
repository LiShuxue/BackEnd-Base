package com.lsx.demo;

import java.util.Date;

public class Student {

	private String name;
	private int age;
	private Date time;
	
	/**
	 * 两个参数的构造
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 无参构造
	 */
	public Student() {
		super();
	}
	
	/**
	 * 一个参数的构造
	 */
	public Student(Date time){
		this.time = time;
	}
	
	/**
	 * 一个参数的构造
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
