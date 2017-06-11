package com.ysj.bean;

public class Rooms {
	
	private Integer roomId;
	private String roomType;
	private Integer status;
	private Integer floor;
	private Integer roomPrice;
	private Integer discountPrice;
	private Integer mprice;
	private Integer vipPrice;
	private String remark;
	private Integer isDel;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(Integer roomPrice) {
		this.roomPrice = roomPrice;
	}
	public Integer getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}
	public Integer getMprice() {
		return mprice;
	}
	public void setMprice(Integer mprice) {
		this.mprice = mprice;
	}
	public Integer getVipPrice() {
		return vipPrice;
	}
	public void setVipPrice(Integer vipPrice) {
		this.vipPrice = vipPrice;
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
	public Rooms(Integer roomId, String roomType, Integer status,
			Integer floor, Integer roomPrice, Integer discountPrice,
			Integer mprice, Integer vipPrice, String remark, Integer isDel) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.status = status;
		this.floor = floor;
		this.roomPrice = roomPrice;
		this.discountPrice = discountPrice;
		this.mprice = mprice;
		this.vipPrice = vipPrice;
		this.remark = remark;
		this.isDel = isDel;
	}
	public Rooms() {
		super();
	}
	
}
