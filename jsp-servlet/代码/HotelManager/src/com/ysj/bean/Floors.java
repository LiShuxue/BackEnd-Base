package com.ysj.bean;

public class Floors {
	
	private Integer floor;
	private String remark;
	private Integer floorPrice;
	private Integer isDel;
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getFloorPrice() {
		return floorPrice;
	}
	public void setFloorPrice(Integer floorPrice) {
		this.floorPrice = floorPrice;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public Floors(Integer floor, String remark, Integer floorPrice,
			Integer isDel) {
		super();
		this.floor = floor;
		this.remark = remark;
		this.floorPrice = floorPrice;
		this.isDel = isDel;
	}
	public Floors() {
		super();
	}
	
}
