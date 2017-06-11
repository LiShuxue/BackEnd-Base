package com.zyw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/**
		 *  Iterator接口  通过迭代器遍历集合
		 *  所有Collection接口的子类，都可以转换为一个迭代器
		 *  通过hasNext()判断 下一个还有没有元素
		 *  通过next()来获取下一个元素
		 *  通过while()循环操作迭代器
		 */
		List list = new ArrayList();
		list.add( new Student(1, "name1") );
		list.add( new Student(2, "name2") );
		list.add( new Student(3, "name3") );
		list.add( new Student(4, "name4") );
		list.add( new Student(5, "name5") );
		
		Iterator iter = list.iterator();	//通过list获取迭代器
		while(iter.hasNext()){				//判断是否有下一个元素
			//如果有
			Object obj = iter.next();		//获取该元素，之后再到循环条件
			//每次next，游标都会向后移动一个位置
			Student stu = (Student)obj;
			System.out.println(stu.getName());
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
