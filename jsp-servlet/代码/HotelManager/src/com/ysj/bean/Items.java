package com.ysj.bean;

public class Items {
	private Integer itemCode;
	private String itemName;
	private Integer typeCode;
	private Integer itemPrice;
	private String itemUnit;
	private String remark;
	private Integer isDel;
	
	public Items() {
		super();
	}

	public Items(Integer itemCode, String itemName, Integer typeCode,
			Integer itemPrice, String itemUnit, String remark, Integer isDel) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.typeCode = typeCode;
		this.itemPrice = itemPrice;
		this.itemUnit = itemUnit;
		this.remark = remark;
		this.isDel = isDel;
	}

	public Integer getItemCode() {
		return itemCode;
	}

	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemUnit() {
		return itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
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

	public void setIsDel(Integer isdel) {
		this.isDel = isdel;
	}
	

}
