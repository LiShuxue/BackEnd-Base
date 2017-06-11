package com.ysj.bean;

public class BookInfo {
	private Integer bookId;
	private Integer roomid;
	private Integer pledge;
	private String customerName;
	private Integer cardType;
	private String cardId;
	private String customerPhone;
	private String arriveTime;
	private String leaveTime;
	private Integer checkinNum;
	private String operator;
	private Integer mId;
	private String remark;
	private String roomType;
	private Integer roomPrice;
	private Integer discountPrice;
	private Integer mPrice;
	private Integer bookStatus; // 1 预定 0取消了 2入住了
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getRoomid() {
		return roomid;
	}
	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
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
	public Integer getCheckinNum() {
		return checkinNum;
	}
	public void setCheckinNum(Integer checkinNum) {
		this.checkinNum = checkinNum;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public Integer getmPrice() {
		return mPrice;
	}
	public void setmPrice(Integer mPrice) {
		this.mPrice = mPrice;
	}
	public Integer getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(Integer bookStatus) {
		this.bookStatus = bookStatus;
	}
	public BookInfo(Integer bookId, Integer roomid, Integer pledge,
			String customerName, Integer cardType, String cardId,
			String customerPhone, String arriveTime, String leaveTime,
			Integer checkinNum, String operator, Integer mId, String remark,
			String roomType, Integer roomPrice, Integer discountPrice,
			Integer mPrice, Integer bookStatus) {
		super();
		this.bookId = bookId;
		this.roomid = roomid;
		this.pledge = pledge;
		this.customerName = customerName;
		this.cardType = cardType;
		this.cardId = cardId;
		this.customerPhone = customerPhone;
		this.arriveTime = arriveTime;
		this.leaveTime = leaveTime;
		this.checkinNum = checkinNum;
		this.operator = operator;
		this.mId = mId;
		this.remark = remark;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.discountPrice = discountPrice;
		this.mPrice = mPrice;
		this.bookStatus = bookStatus;
	}
	public BookInfo() {
		super();
	}

	
}
