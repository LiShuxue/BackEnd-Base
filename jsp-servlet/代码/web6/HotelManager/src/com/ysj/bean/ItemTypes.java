package com.ysj.bean;

public class ItemTypes {
	private Integer typeCode;
	private String typeName;
	private String remark;
	private Integer isDel;
	
	public ItemTypes() {
		super();
	}

	public ItemTypes(Integer typeCode, String typeName, String remark,
			Integer isDel) {
		super();
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.remark = remark;
		this.isDel = isDel;
	}

	public Integer getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Integer typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
