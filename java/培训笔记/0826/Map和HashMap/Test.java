package com.zyw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/**
		 *  Map 和 HashMap
		 *  以键/值   的形式 保存数据
		 *  键不能重复， 没有顺序。
		 */
		//创建一个集合
		Map map = new HashMap();
		//向集合中保存数据	put(Object键 , Object值) 可以以任何类型作为键
		map.put("a", new Date());
		map.put(null, 100);
		map.put(100, "hello");
		//通过键，获取值
		System.out.println(map.get("a"));
		System.out.println(map.get(null));
		System.out.println(map.get(100));
		System.out.println("--------------------------");
		//获取map这个集合的所有键
		Set keys = map.keySet();	//所有键
		for(Object key : keys){		//遍历所有键
			System.out.println(map.get(key));	//通过键来获取值
		}
		
		/**
		 * 练习： 创建一个ArrayList集合，向集合中保存五个Map对象，每个Map都拥有自己的元素。
		 * 		通过Iterator来迭代 ArrayList集合 并显示出  "每个Map的所有元素"
		 */
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
