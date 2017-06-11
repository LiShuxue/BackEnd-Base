package com.lsx.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Cou entity. @author MyEclipse Persistence Tools
 */

public class Cou implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String cname;
	private Set stus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Cou() {
	}

	/** full constructor */
	public Cou(String cname, Set stus) {
		this.cname = cname;
		this.stus = stus;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStus() {
		return this.stus;
	}

	public void setStus(Set stus) {
		this.stus = stus;
	}

}