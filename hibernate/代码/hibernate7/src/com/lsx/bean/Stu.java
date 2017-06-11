package com.lsx.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Stu entity. @author MyEclipse Persistence Tools
 */

public class Stu implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String sname;
	private Set cous = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stu() {
	}

	/** full constructor */
	public Stu(String sname, Set cous) {
		this.sname = sname;
		this.cous = cous;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getCous() {
		return this.cous;
	}

	public void setCous(Set cous) {
		this.cous = cous;
	}

}