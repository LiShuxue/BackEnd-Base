package com.zyw.gradation1;

/**
 * Dvd1 entity. @author MyEclipse Persistence Tools
 */

public class Dvd1 extends Items implements java.io.Serializable {

	// Fields
	private String quyuma;

	// Constructors

	/** default constructor */
	public Dvd1() {
	}

	
	public Dvd1(String name, String publishers, String quyuma) {
		super(name, publishers);
		this.quyuma = quyuma;
	}

	public String getQuyuma() {
		return this.quyuma;
	}

	public void setQuyuma(String quyuma) {
		this.quyuma = quyuma;
	}

}