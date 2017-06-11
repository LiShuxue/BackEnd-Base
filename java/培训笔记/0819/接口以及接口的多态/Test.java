package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//����һ��껳�
		Person p = new Person("haochen");
		//껳����ܸ�ʲô��
		p.coquetry();
		p.study();
		p.work();
		//���껳�����ѧУ����һ��ѧ����ʱ��
		System.out.println("-------��ѧУ---------");
		IStudent student = p;	//��̬
		student.study();	//ֻ��ѧϰ�������˱������
		System.out.println("---------���˹�˾---------");
		IEmployee emp = p;	//��̬
		emp.work();
		System.out.println("--------�ص��˼ң�����������--------");
		ISon son = p;	//��̬
		son.coquetry();
		System.out.println("-----------------------");
		
		new Test().work(p);
	}
	
	/**
	 * ��Ҫһ��Ա��������
	 * @param e
	 */
	public void work(IEmployee e){
		e.work();
	}

}
/**
 *  implementsʵ�ֽӿڣ�������Ÿ���
 *
 */
class Person implements IStudent,IEmployee,ISon{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void coquetry() {
		System.out.println(name + "��������");
	}

	@Override
	public void work() {
		System.out.println(name + "���ڹ���");
	}

	@Override
	public void study() {
		System.out.println(name + "����ѧϰ");
	}
}

/**
 * ѧ����ɫ��ѧϰ����
 */
interface IStudent{
	void study();
}

/**
 * ���ӽ�ɫ����������
 */
interface ISon{
	void coquetry();
}

/**
 * Ա����ɫ������
 */
interface IEmployee{
	void work();
}







