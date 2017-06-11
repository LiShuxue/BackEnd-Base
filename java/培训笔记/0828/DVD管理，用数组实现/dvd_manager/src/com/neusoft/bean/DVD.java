package com.neusoft.bean;

import java.util.Date;
/**
 *	DVD��	
 *	�������ԡ����Է�װget/set�������в�/�޲ι���
 *	�����Java�е�ʵ���ࣨJavaBean��POJO��
 */
public class DVD {

	private int id;			//���
	private String name;	//����
	private boolean state;	//���״̬
	private	Date time;		//���ʱ��
	private int count;		//�������
	private boolean isDel;	//�Ƿ�ɾ��
	
	public DVD(int id, String name, boolean state, Date time, int count,
			boolean isDel) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.time = time;
		this.count = count;
		this.isDel = isDel;
	}

	public DVD() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	@Override
	public DVD clone() throws CloneNotSupportedException {
		//throws�÷���������õ�ʱ�򣬻ᱨCloneNotSupportedException�쳣
		//�Ե�ǰ��Ҫ�����������������һ�ο�¡
		//����һ���µ�DVD���󣬽����ø÷����Ķ�����������Ը�ֵ��ȥ
		DVD dvd = new DVD(this.id, this.name, this.state, this.time, this.count, this.isDel);
		return dvd;
	}
	
	public static void main(String[] args) {
		//���Կ�¡����
		DVD d = new DVD(1, "a", true, null, 1, false);
		System.out.println(d);
		try {
			//��try������г����쳣ʱ����ִ���·���catch�����
			//���ø÷���ʱ����Ҫ�����׳����쳣�����в��񡢴���
			//��¡�Ķ��������������У���������Ͱ�ȫ��
			DVD d2 = d.clone();
			System.out.println(d2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();//�����̨��ʾ������Ϣ�������ȥ�������
		}
		
	}
	
}
