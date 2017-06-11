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
		 *  Map �� HashMap
		 *  �Լ�/ֵ   ����ʽ ��������
		 *  �������ظ��� û��˳��
		 */
		//����һ������
		Map map = new HashMap();
		//�򼯺��б�������	put(Object�� , Objectֵ) �������κ�������Ϊ��
		map.put("a", new Date());
		map.put(null, 100);
		map.put(100, "hello");
		//ͨ��������ȡֵ
		System.out.println(map.get("a"));
		System.out.println(map.get(null));
		System.out.println(map.get(100));
		System.out.println("--------------------------");
		//��ȡmap������ϵ����м�
		Set keys = map.keySet();	//���м�
		for(Object key : keys){		//�������м�
			System.out.println(map.get(key));	//ͨ��������ȡֵ
		}
		
		/**
		 * ��ϰ�� ����һ��ArrayList���ϣ��򼯺��б������Map����ÿ��Map��ӵ���Լ���Ԫ�ء�
		 * 		ͨ��Iterator������ ArrayList���� ����ʾ��  "ÿ��Map������Ԫ��"
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
