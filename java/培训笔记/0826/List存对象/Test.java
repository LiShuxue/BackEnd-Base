package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * 向ArrayList中存储实体对象
		 */
		List stuList = new ArrayList();
		//向集合中保存一个学生对象
		stuList.add( new Student(1, "zhangsan"));
		stuList.add( new Student(2, "lisi"));
		stuList.add( new Student(3, "wangwu"));
		//通过循环遍历集合，显示3个学生信息,每一次循环将集合的元素给obj
		for(Object obj : stuList){
			Student s = (Student)obj;	//强转Object类型到Student类型
			System.out.println(s.getId() + "\t" + s.getName());
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

