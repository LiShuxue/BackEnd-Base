package com.lsx.bean;

/**
 * Card entity. @author MyEclipse Persistence Tools
 */

public class Card implements java.io.Serializable {

	// Fields

	private Integer cid;
	private Person person;
	private String cnum;

	// Constructors

	/** default constructor */
	public Card() {
	}

	/** minimal constructor */
	public Card(Person person) {
		this.person = person;
	}

	/** full constructor */
	public Card(Person person, String cnum) {
		this.person = person;
		this.cnum = cnum;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCnum() {
		return this.cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

}