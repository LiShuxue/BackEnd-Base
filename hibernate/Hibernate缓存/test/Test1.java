package com.zyw.test;

/**
 * Test1 entity. @author MyEclipse Persistence Tools
 */

public class Test1 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public Test1() {
	}

	/** full constructor */
	public Test1(String name) {
		this.name = name;
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

}