package com.lsx.bean;

/**
 * Sc entity. @author MyEclipse Persistence Tools
 */

public class Sc implements java.io.Serializable {

	// Fields

	private Integer scid;
	private Stu stu;
	private Integer score;

	// Constructors

	/** default constructor */
	public Sc() {
	}

	/** full constructor */
	public Sc(Stu stu, Integer score) {
		this.stu = stu;
		this.score = score;
	}

	// Property accessors

	public Integer getScid() {
		return this.scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public Stu getStu() {
		return this.stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}