package com.neusoft.bean;

import java.sql.Date;
/**
 *	DVD��	
 *	�������ԡ����Է�װget/set�������в�/�޲ι���
 *	�����Java�е�ʵ���ࣨJavaBean��POJO��
 */
public class DVD {

	private Integer id;			//���
	private String name;	    //����
	private Integer state;	   //���״̬
	private	Date time;		   //���ʱ��
	private Integer count;		//�������
	private Integer isDel;	    //�Ƿ�ɾ��
	
	public DVD() {
		super();
	}

	public DVD(Integer id, String name, Integer state, Date time,
			Integer count, Integer isDel) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.time = time;
		this.count = count;
		this.isDel = isDel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	
}
