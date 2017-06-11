package com.zyw.gradation1;

/**
 * Book1 entity. @author MyEclipse Persistence Tools
 */

public class Book1 extends Items implements java.io.Serializable{

	// Fields
	private Integer pagecount;

	// Constructors

	/** default constructor */
	public Book1() {
	}

	public Book1(String name, String publishers, Integer pagecount) {
		super(name, publishers);
		this.pagecount = pagecount;
	}

	public Integer getPagecount() {
		return this.pagecount;
	}

	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}

}