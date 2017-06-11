package com.lsx.bean;

/**
 * U2 entity. @author MyEclipse Persistence Tools
 */

public class U2 implements java.io.Serializable {

	// Fields

	private U2Id id;
	private Integer age;

	// Constructors

	/** default constructor */
	public U2() {
	}

	/** minimal constructor */
	public U2(U2Id id) {
		this.id = id;
	}

	/** full constructor */
	public U2(U2Id id, Integer age) {
		this.id = id;
		this.age = age;
	}

	// Property accessors

	public U2Id getId() {
		return this.id;
	}

	public void setId(U2Id id) {
		this.id = id;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}