package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//创建了一个 1 zhaungsan
		Student stu = new Student(1, "zhangsan");
		List list = new ArrayList();
		//将张三保存到集合中
		list.add(stu);
		//修改张三的状态
		stu.setName("lisi");
		//访问集合中保存的stu
		System.out.println( ((Student)list.get(0)).getName() );
		//你可以发现集中的zhangsan变成了lisi，可见集合中保存的是stu的引用
	}
}


class Student{
	private Integer id;
	private String name;
	public Student(Integer id,String name){
		this.id = id;
		this.name = name;
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
	
}
