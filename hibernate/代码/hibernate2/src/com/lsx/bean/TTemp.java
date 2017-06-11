package com.lsx.bean;

import java.sql.Blob;
import java.sql.Clob;

/**
 * TTemp entity. @author MyEclipse Persistence Tools
 */

public class TTemp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Clob msg;
	private Blob img;

	// Constructors

	/** default constructor */
	public TTemp() {
	}

	/** full constructor */
	public TTemp(String name, Clob msg, Blob img) {
		this.name = name;
		this.msg = msg;
		this.img = img;
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

	public Clob getMsg() {
		return this.msg;
	}

	public void setMsg(Clob msg) {
		this.msg = msg;
	}

	public Blob getImg() {
		return this.img;
	}

	public void setImg(Blob img) {
		this.img = img;
	}

}