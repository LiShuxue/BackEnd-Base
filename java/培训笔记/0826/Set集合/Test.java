package com.zyw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/**
		 *  Set接口保存，无序，无重复 的元素
		 */
		Set set = new HashSet();
		Student stu = new Student(1, "zhangsan");
		set.add(stu);
		set.add(stu);
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		System.out.println("元素数量:" + set.size());
		//显示set中所有的内容
		for(Object obj : set){
			System.out.println(obj);
		}
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
