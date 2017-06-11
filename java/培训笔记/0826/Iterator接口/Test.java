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
		 *  Iterator�ӿ�  ͨ����������������
		 *  ����Collection�ӿڵ����࣬������ת��Ϊһ��������
		 *  ͨ��hasNext()�ж� ��һ������û��Ԫ��
		 *  ͨ��next()����ȡ��һ��Ԫ��
		 *  ͨ��while()ѭ������������
		 */
		List list = new ArrayList();
		list.add( new Student(1, "name1") );
		list.add( new Student(2, "name2") );
		list.add( new Student(3, "name3") );
		list.add( new Student(4, "name4") );
		list.add( new Student(5, "name5") );
		
		Iterator iter = list.iterator();	//ͨ��list��ȡ������
		while(iter.hasNext()){				//�ж��Ƿ�����һ��Ԫ��
			//�����
			Object obj = iter.next();		//��ȡ��Ԫ�أ�֮���ٵ�ѭ������
			//ÿ��next���α궼������ƶ�һ��λ��
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
