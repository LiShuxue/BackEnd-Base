package com.zyw;

public class Test {

	public static void main(String[] args) {
		/**
		 *  ���� ͨ�� super���ø������Ժͷ���
		 */
		Student s = new Student();
		
	}

}

class Person{
	protected String name = "lisi";
	
	public void eat(){
		System.out.println("�����гԷ�����");
	}
}


class Student extends Person{
	
	/**
	 * �������У����Լ�д��һ���͸�����ͬ�ķ��������޷��̳и���ķ���
	 * ���౾��������һ�������������಻ʹ�ã��Լ�д��һ����ͬ�ķ�������������Ϊ���� ������д
	 * ����д�Ĺ����п���ȥ�������Ȩ�ޣ������ protected ��дΪ publics
	 * ����֮������
	 * ��д�������޸ķ���ֵ����
	 */
	public void eat(){
		//���ø�������� �ͷ���
		System.out.println("����������ǣ�" + super.name);
		super.eat();
		System.out.println("����Է�����");
	}
	
	/*public void eat(int a){
		��ôд��������
	}*/
	
}











