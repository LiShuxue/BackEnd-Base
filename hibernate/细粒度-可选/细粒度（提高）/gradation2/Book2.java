package com.zyw.gradation2;

/**
 * Book2 entity. @author MyEclipse Persistence Tools
 */

public class Book2 extends Item2 implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pagecount;

	// Constructors

	/** default constructor */
	public Book2() {
	}

	/** full constructor */
	public Book2(Integer pagecount) {
		this.pagecount = pagecount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPagecount() {
		return this.pagecount;
	}

	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}

}