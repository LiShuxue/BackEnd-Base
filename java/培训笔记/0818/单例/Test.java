package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 * 		����ģʽ
		 * 	ʹ�õ���ģʽ���ֻ࣬��һ�����󣬶����㲻����ʵ����
		 * 	������Լ���ȥά���Լ����Ϊһ����������ÿ����Ҫ��ʱ�򣬸���ͬһ��
		 * 	1.˽�л���Ĺ���
		 * 	2.����һ�� ˽�� ��̬ ��ǰ��Ķ��� ��Ϊ����
		 * 	3.ͨ��һ������  ��̬ �ķ�����һ�㶼������ getInstance() �������ظ�����
		 */
		
		/*System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());
		System.out.println(Student.getInstance());*/
		
		Student.getInstance().sayHello("haoChen");
		Student.getInstance().sayHello("feiJin");
	}

}

class Student{
	private static Student stu = null;
	private Student(){
		
	}
	public static Student getInstance(){
		if(stu == null){
			stu = new Student();
		}
		return stu;
	}
	
	public void sayHello(String name){
		System.out.println("hello:" + name);
	}
	
}












