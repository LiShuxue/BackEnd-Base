package com.ysj.bean;

public class CoReport {
	private Integer ciId;
	private Integer roomId;
	private String roomType;
	private String customerName;
	private Integer mId;
	private Integer allCost;
	private Integer payType;
	private String leaveTime;
	public CoReport() {
		super();
	}
	public CoReport(Integer ciId, Integer roomId, String roomType,
			String customerName, Integer mId, Integer allCost, Integer payType,
			String leaveTime) {
		super();
		this.ciId = ciId;
		this.roomId = roomId;
		this.roomType = roomType;
		this.customerName = customerName;
		this.mId = mId;
		this.allCost = allCost;
		this.payType = payType;
		this.leaveTime = leaveTime;
	}
	public Integer getCiId() {
		return ciId;
	}
	public void setCiId(Integer ciId) {
		this.ciId = ciId;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public Integer getAllCost() {
		return allCost;
	}
	public void setAllCost(Integer allCost) {
		this.allCost = allCost;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
}
