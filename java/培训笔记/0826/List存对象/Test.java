package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/**
		 * ��ArrayList�д洢ʵ�����
		 */
		List stuList = new ArrayList();
		//�򼯺��б���һ��ѧ������
		stuList.add( new Student(1, "zhangsan"));
		stuList.add( new Student(2, "lisi"));
		stuList.add( new Student(3, "wangwu"));
		//ͨ��ѭ���������ϣ���ʾ3��ѧ����Ϣ,ÿһ��ѭ�������ϵ�Ԫ�ظ�obj
		for(Object obj : stuList){
			Student s = (Student)obj;	//ǿתObject���͵�Student����
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

