package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * 向集合中保存集合
		 * 向集合中保存5和集合
		 * 将一个对象保存到集合中，该对象状态改变了，集合中保存的对象也会同时改变
		 * 向集合中存储元素，就是保存引用。
		 */
		List parent = new ArrayList();
		
		List child01 = new ArrayList();
		List child02 = new ArrayList();
		List child03 = new ArrayList();
		List child04 = new ArrayList();
		List child05 = new ArrayList();
		parent.add(child01);
		parent.add(child02);
		parent.add(child03);
		parent.add(child04);
		parent.add(child05);
		
		for(Object obj : parent){
			List childList = (List)obj;
			System.out.println("集合中的元素的，元素数量是:" + childList.size());
		}
		System.out.println("---------------------------------");
		child01.add(100);
		child03.add(100);
		for(Object obj : parent){
			List childList = (List)obj;
			System.out.println("集合中的元素的，元素数量是:" + childList.size());
		}
	}
}

