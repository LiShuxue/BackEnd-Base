package com.zyw.gradation3;

/**
 * Item3 entity. @author MyEclipse Persistence Tools
 */

public class Item3 implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String menuf;
	private String iden;

	// Constructors

	/** default constructor */
	public Item3() {
	}

	
	public Item3(Integer id, String name, String menuf) {
		super();
		this.id = id;
		this.name = name;
		this.menuf = menuf;
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

	public String getMenuf() {
		return this.menuf;
	}

	public void setMenuf(String menuf) {
		this.menuf = menuf;
	}


	public String getIden() {
		return iden;
	}


	public void setIden(String iden) {
		this.iden = iden;
	}

	

}