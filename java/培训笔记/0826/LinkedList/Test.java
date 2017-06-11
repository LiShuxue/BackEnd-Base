package com.zyw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/**
		 *  LinkedList ģ������ļ��ϣ�֧��ͷβ����
		 */
		LinkedList list = new LinkedList();
		//�ӿ�ͷ�ͽ�β�������
		list.addFirst(new Student(1, "zhangsan"));
		list.addFirst(new Student(2, "lisi"));
		list.addLast( new Student(3, "wangwu"));
		// lisi  zhangsan   wangwu���˳��
		System.out.println("��һ��Ԫ�أ�" + list.getFirst());
		System.out.println("���һ��Ԫ�أ�" + list.getLast());
		//ͨ��ѭ�����ʸü���
		for(Object obj : list){
			System.out.println("ѭ����Ԫ�أ�" + obj);
		}
		//�Ƴ�����ø�Ԫ��
		Object first = list.removeFirst();
		Object last = list.removeLast();
		System.out.println("�Ƴ���β��ļ��ϳ��ȣ�" + list.size());
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
