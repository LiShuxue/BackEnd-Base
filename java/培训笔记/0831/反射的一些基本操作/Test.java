package com.zyw.test;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
	
	public static void main(String[] args) throws Exception{
		/**
		 *  ���� �� ������ĳ���һ��Java������
		 *  ͨ��������Ը���һ����·�������������������ȡ������е�������Ϣ������˽�У�
		 */
		//ʹ�÷��䣬������Ҫ�õ������� Class���������¼��ַ�ʽ����ȡ
		//1.ͨ����·��
		try {
			Class c1 = Class.forName("com.zyw.test.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.ͨ������������  �����ڴ���
		Class c2 = MyClass.class;
		//3.ͨ������
		MyClass my = new MyClass();
		Class c3 = my.getClass();
		//�����·��
		System.out.println(my.getClass().getName());
		//����ͽӿ�
		Class sup = c3.getSuperclass();
		System.out.println("���ࣺ" + sup.getName());
		//��ýӿ�
		System.out.println("���нӿڣ�");
		Class[] inters = c3.getInterfaces();
		for (Class inte : inters) {
			System.out.println(inte.getName());
		}
		
		//---------------------------------------------
		//java.lang.reflect.Field  //���䶼��reflect����
		//��ȡMyClass�������е�����
		System.out.println("���ԣ�");
		Field[] fs = c3.getDeclaredFields();
		for (Field f : fs) {
			System.out.print(f.getType() + " ");
			System.out.print(f.getName() + " = ");
			//�����Ҫ�õ���������ֵ���ͱ���Ҫһ��һ�����󣬱�ʾ���������������ֵ
			//��������� ��̬�ģ� �Ͳ���Ҫ�����ˣ�ֱ��ͨ��null�Ϳ��Ի�ȡ
			f.setAccessible(true);		//���������˽�У��������÷���Ȩ��
			System.out.println(f.get(my));
		}
		//�������෽��,��ȡ�������з���
		System.out.println("������");
		Method[] methods = c3.getMethods();
		for(Method m : methods){
			System.out.print( Modifier.toString( m.getModifiers() ) + " ");
			System.out.print( m.getReturnType().getName() + " ");
			System.out.print(m.getName() + "(");
			//���в�������
			Class[] types = m.getParameterTypes();
			for(int i=0; i < types.length; i++){
				System.out.print(i < types.length-1 ? types[i].getName() + "," : types[i].getName());
			}
			System.out.println(")");
		}
	}
}

class MyClass implements Serializable,Cloneable{
	private int id = 100;
	private String name = "zhangsan";
	public void method1(){
		System.out.println("����1");
	}
	public String method2(){
		return "����2";
	}
}
