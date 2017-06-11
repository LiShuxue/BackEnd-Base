package com.lsx.bean;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Card card;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** full constructor */
	public Person(String pname, Card card) {
		this.pname = pname;
		this.card = card;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Card getCard() {
		return this.card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}