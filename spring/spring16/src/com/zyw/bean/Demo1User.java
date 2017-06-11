package com.zyw.bean;

/**
 * Demo1User entity. @author MyEclipse Persistence Tools
 */

public class Demo1User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer age;

	// Constructors

	/** default constructor */
	public Demo1User() {
	}

	/** minimal constructor */
	public Demo1User(String name) {
		this.name = name;
	}

	/** full constructor */
	public Demo1User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}