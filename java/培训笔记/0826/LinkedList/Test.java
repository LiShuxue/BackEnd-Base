package com.zyw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/**
		 *  LinkedList 模拟链表的集合，支持头尾操作
		 */
		LinkedList list = new LinkedList();
		//从开头和结尾添加数据
		list.addFirst(new Student(1, "zhangsan"));
		list.addFirst(new Student(2, "lisi"));
		list.addLast( new Student(3, "wangwu"));
		// lisi  zhangsan   wangwu这个顺序
		System.out.println("第一个元素：" + list.getFirst());
		System.out.println("最后一个元素：" + list.getLast());
		//通过循环访问该集合
		for(Object obj : list){
			System.out.println("循环的元素：" + obj);
		}
		//移除并获得该元素
		Object first = list.removeFirst();
		Object last = list.removeLast();
		System.out.println("移除首尾后的集合长度：" + list.size());
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
