package com.ysj.bean;

public class Ci {
	private Integer ciId;
	private Integer roomId;
	private String roomType;
	private Integer roomPrice;
	private Integer discountPrice;
	private Integer pledge;
	private String customerName;
	private Integer cardType;
	private String cardId;
	private String customerPhone;
	private String arriveTime;
	private String leaveTime;
	private Integer checkintNum;
	private String operator;
	private Integer mid;
	private Integer mPrice;
	private Integer isBreakFirst;
	private Integer isClock;
	private String remark;
	private Integer status;//0为入住,1为退房
	public Ci(Integer ciId, Integer roomId, String roomType, Integer roomPrice,
			Integer discountPrice, Integer pledge, String customerName,
			Integer cardType, String cardId, String customerPhone,
			String arriveTime, String leaveTime, Integer checkintNum,
			String operator, Integer mid, Integer mPrice, Integer isBreakFirst,
			Integer isClock, String remark, Integer status) {
		super();
		this.ciId = ciId;
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.discountPrice = discountPrice;
		this.pledge = pledge;
		this.customerName = customerName;
		this.cardType = cardType;
		this.cardId = cardId;
		this.customerPhone = customerPhone;
		this.arriveTime = arriveTime;
		this.leaveTime = leaveTime;
		this.checkintNum = checkintNum;
		this.operator = operator;
		this.mid = mid;
		this.mPrice = mPrice;
		this.isBreakFirst = isBreakFirst;
		this.isClock = isClock;
		this.remark = remark;
		this.status = status;
	}
	public Ci() {
		super();
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
	public Integer getPledge() {
		return pledge;
	}
	public void setPledge(Integer pledge) {
		this.pledge = pledge;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCardType() {
		return cardType;
	}
	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public Integer getCheckintNum() {
		return checkintNum;
	}
	public void setCheckintNum(Integer checkintNum) {
		this.checkintNum = checkintNum;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getmPrice() {
		return mPrice;
	}
	public void setmPrice(Integer mPrice) {
		this.mPrice = mPrice;
	}
	public Integer getIsBreakFirst() {
		return isBreakFirst;
	}
	public void setIsBreakFirst(Integer isBreakFirst) {
		this.isBreakFirst = isBreakFirst;
	}
	public Integer getIsClock() {
		return isClock;
	}
	public void setIsClock(Integer isClock) {
		this.isClock = isClock;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
