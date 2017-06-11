package com.ysj.bean;

public class Co {
	private Integer ciId;
	private Integer roomId;
	private Integer price;
	private Integer pledge;
	private Integer days;
	private Integer roomCost;
	private Integer otherCost;
	private Integer foodCost;
	private Integer phoneCost;
	private Integer allCost;
	private Integer payType;
	private Integer getMoney;
	private String operator ;
	private String remark;
	
	public Co() {
		super();
	}

	public Co(Integer ciId, Integer roomId, Integer price, Integer pledge,
			Integer days, Integer roomCost, Integer otherCost,
			Integer foodCost, Integer phoneCost, Integer allCost,
			Integer payType, Integer getMoney, String operator, String remark) {
		super();
		this.ciId = ciId;
		this.roomId = roomId;
		this.price = price;
		this.pledge = pledge;
		this.days = days;
		this.roomCost = roomCost;
		this.otherCost = otherCost;
		this.foodCost = foodCost;
		this.phoneCost = phoneCost;
		this.allCost = allCost;
		this.payType = payType;
		this.getMoney = getMoney;
		this.operator = operator;
		this.remark = remark;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPledge() {
		return pledge;
	}

	public void setPledge(Integer pledge) {
		this.pledge = pledge;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(Integer roomCost) {
		this.roomCost = roomCost;
	}

	public Integer getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(Integer otherCost) {
		this.otherCost = otherCost;
	}

	public Integer getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(Integer foodCost) {
		this.foodCost = foodCost;
	}

	public Integer getPhoneCost() {
		return phoneCost;
	}

	public void setPhoneCost(Integer phoneCost) {
		this.phoneCost = phoneCost;
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

	public Integer getGetMoney() {
		return getMoney;
	}

	public void setGetMoney(Integer getMoney) {
		this.getMoney = getMoney;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
