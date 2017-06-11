package com.ysj.bean;

import java.sql.Date;

public class Members {
	private Integer mid;
	private String mname;
	private String msex;
	private String mpassword;
	private String mphone;
	private String maddress;
	private String memail;
	private Integer mpoints;
	private String mtype;
	private Date mbookTime;
	private Date mpresetTime;
	private String remark;
	private Integer isDel;
	
	public Members() {
		super();
	}

	public Members(Integer mid, String mname, String msex, String mpassword,
			String mphone, String maddress, String memail, Integer mpoints,
			String mtype, Date mbookTime, Date mpresetTime, String remark,
			Integer isDel) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.msex = msex;
		this.mpassword = mpassword;
		this.mphone = mphone;
		this.maddress = maddress;
		this.memail = memail;
		this.mpoints = mpoints;
		this.mtype = mtype;
		this.mbookTime = mbookTime;
		this.mpresetTime = mpresetTime;
		this.remark = remark;
		this.isDel = isDel;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMsex() {
		return msex;
	}

	public void setMsex(String msex) {
		this.msex = msex;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public Integer getMpoints() {
		return mpoints;
	}

	public void setMpoints(Integer mpoints) {
		this.mpoints = mpoints;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public Date getMbookTime() {
		return mbookTime;
	}

	public void setMbookTime(Date mbookTime) {
		this.mbookTime = mbookTime;
	}

	public Date getMpresetTime() {
		return mpresetTime;
	}

	public void setMpresetTime(Date mpresetTime) {
		this.mpresetTime = mpresetTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
		
}
