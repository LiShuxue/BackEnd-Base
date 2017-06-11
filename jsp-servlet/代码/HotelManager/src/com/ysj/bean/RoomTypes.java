package com.ysj.bean;

public class RoomTypes {
	private String roomType;
	private Integer roomPeopleNum;
	private String remark;
	private Integer typPrice;
	private Integer isDel;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public RoomTypes() {
		super();
	}
	public RoomTypes(String roomType, Integer roomPeopleNum, String remark,
			Integer typPrice, Integer isDel) {
		super();
		this.roomType = roomType;
		this.roomPeopleNum = roomPeopleNum;
		this.remark = remark;
		this.typPrice = typPrice;
		this.isDel = isDel;
	}
	public Integer getRoomPeopleNum() {
		return roomPeopleNum;
	}
	public void setRoomPeopleNum(Integer roomPeopleNum) {
		this.roomPeopleNum = roomPeopleNum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getTypPrice() {
		return typPrice;
	}
	public void setTypPrice(Integer typPrice) {
		this.typPrice = typPrice;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	
	
}
