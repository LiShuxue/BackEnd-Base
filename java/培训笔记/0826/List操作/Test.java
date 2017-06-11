package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 *   集合 List   ArrayList
		 */
		//创建一个空集合，初始容量10
		List list = new ArrayList();
		//向集合中添加一个元素，类型任意
		list.add("第一个元素");	//它的返回值true，不用处理
		System.out.println("集合的元素数量:" + list.size());
		list.add(0, "第二个元素");//索引从0开始，在前面插入了一个元素后，原有的元素会向后移动1位
		//查看集合中的元素,方式1
		for(Object obj : list){
			System.out.print(obj + "\t");
		}
		System.out.println();
		//方式2,用i作为索引
		for(int i=0; i<list.size(); i++){
			//Object get(索引) 通过指定索引，获取元素
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		//创建一个新集合
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		//将list2所有的元素，填到list的末尾
		list.addAll(list2);
		for(Object obj : list){
			System.out.print(obj + "\t");
		}
		System.out.println();
		//清空集合
		//list.clear();
		//System.out.println("清空后，集合的元素数量:" + list.size());
		//contains 查找集合中是否包含指定的元素
		System.out.println("是否包含指定元素：" + list.contains(100));
		//返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
		System.out.println("查找元素第一次出现的索引：" + list.indexOf(200));
		//如果此列表中没有元素，则返回 true
		System.out.println("判断集合是不是空的：" + list.isEmpty());
		//remove(int index)通过索引删除元素，并返回该元素
		Object obj = list.remove(2);
		System.out.println("移除的元素是：" + obj);
		//boolean remove(Object o) 在集合中删除相同的给定元素
		System.out.println("删除给定的元素:" + list.remove(new Integer(200)));
		//set(int index, E element)  用指定的元素替代此列表中指定位置上的元素。返回被替换掉的元素
		Object obj2 = list.set(0, 100);
		System.out.println(obj2);
		
		
	}
	
	

}

