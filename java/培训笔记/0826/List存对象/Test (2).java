package com.zyw;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//������һ�� 1 zhaungsan
		Student stu = new Student(1, "zhangsan");
		List list = new ArrayList();
		//���������浽������
		list.add(stu);
		//�޸�������״̬
		stu.setName("lisi");
		//���ʼ����б����stu
		System.out.println( ((Student)list.get(0)).getName() );
		//����Է��ּ��е�zhangsan�����lisi���ɼ������б������stu������
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
