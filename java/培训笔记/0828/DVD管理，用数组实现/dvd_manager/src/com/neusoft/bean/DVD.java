package com.neusoft.bean;

import java.util.Date;
/**
 *	DVD类	
 *	包含属性、属性封装get/set方法、有参/无参构造
 *	这就是Java中的实体类（JavaBean、POJO）
 */
public class DVD {

	private int id;			//编号
	private String name;	//名称
	private boolean state;	//借出状态
	private	Date time;		//借出时间
	private int count;		//借出次数
	private boolean isDel;	//是否删除
	
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
		//throws该方法在你调用的时候，会报CloneNotSupportedException异常
		//对当前我要操作的这个对象，做了一次克隆
		//创建一个新的DVD对象，将调用该方法的对象的所有属性赋值进去
		DVD dvd = new DVD(this.id, this.name, this.state, this.time, this.count, this.isDel);
		return dvd;
	}
	
	public static void main(String[] args) {
		//测试克隆方法
		DVD d = new DVD(1, "a", true, null, 1, false);
		System.out.println(d);
		try {
			//当try代码块中出现异常时，将执行下方的catch代码块
			//调用该方法时，需要对他抛出的异常，进行捕获、处理
			//克隆的对象它不再数组中，这样数组就安全了
			DVD d2 = d.clone();
			System.out.println(d2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();//向控制台显示错误信息，你可以去做别的事
		}
		
	}
	
}
