package com.zyw.gradation2;

/**
 * Dvd2 entity. @author MyEclipse Persistence Tools
 */

public class Dvd2 extends Item2 implements java.io.Serializable{

	// Fields

	private Integer id;
	private String code;

	// Constructors

	/** default constructor */
	public Dvd2() {
	}

	/** full constructor */
	public Dvd2(String code) {
		this.code = code;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}