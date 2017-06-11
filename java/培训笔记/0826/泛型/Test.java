package com.zyw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		/**
		 * 向<E>E的位置填写一个数据类型，那么以后这个集合就只能存储该类型的数据
		 * 在你获取集合中数据的时候，也不需要强制转换了
		 */
		//只能add(Integer)
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		//获取数据  get() 返回值 是Integer
		System.out.println(list.get(0));
		for(Integer i : list){
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		Map<String, Integer> map = new HashMap<String, Integer>();
		//保存数据的时候，key必须是字符串，值必须是数字
		map.put("a", 100);
		map.put("b", 200);
		System.out.println(map.get("a"));		//找不到返回null
		Set<String> keys = map.keySet();	//所有的key
		
	}
}


