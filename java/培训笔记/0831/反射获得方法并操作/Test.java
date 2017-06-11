package com.zyw.test;

import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws Exception{
		/**
		 *  �Զ���һ�����������Բ������б���ɾ�Ĳ飩
		 *  ����ֵ���ڶ�������������ѯ�ж������һ������û�н���ȡ���
		 */
		Test t = new Test();
		Method[] method = t.getClass().getMethods();
		for(Method m : method){	//ѭ��Test���еķ�������
			//������ķ�����set��ͷ���͵����������
			if(m.getName().startsWith("set")){
				//��Ϊ��ʵ������������Ҫ����һ�������ٴ���һ��������û�з���ֵ
				m.invoke(t, 99);	//���õ�ǰ�������
			}
			//������ķ�����get��ͷ���͵����������
			if(m.getName().startsWith("get")){
				//�ö�����ã�����ʵ����û�в������з���ֵresult
				Object result =  m.invoke(t, null);
				System.out.println(result);
			}
		}
		
	}
	
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
	