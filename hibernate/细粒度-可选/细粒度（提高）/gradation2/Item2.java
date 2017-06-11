package com.zyw.gradation2;

/**
 * Item2 entity. @author MyEclipse Persistence Tools
 */

public class Item2 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String chuban;

	// Constructors

	/** default constructor */
	public Item2() {
	}

	/** full constructor */
	public Item2(String name, String chuban) {
		this.name = name;
		this.chuban = chuban;
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

	public String getChuban() {
		return this.chuban;
	}

	public void setChuban(String chuban) {
		this.chuban = chuban;
	}

}