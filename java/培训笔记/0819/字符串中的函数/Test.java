package com.zyw;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String s = " 12345 ";//����ͨ������õ�
		//���s�ĳ��ȣ��� trim() һ�£��ٻ�ó���
		/*
		 * trim() ����ֵ��ȥ��ǰ��ո��  �ַ���
		 * length() ����int
		 */
		int len = s.trim().length();
		System.out.println("������:" + len);
		
		/*
		 * 	booealn equalsIgnoreCase() ���Դ�Сд�Ƚ������ַ���������boolean
		 * 	String toLowerCase()	���ַ���ת��Сд	����string
		 * 	String toUpperCase()	���ַ���ת����д	����string
		 * 	String concat(String str)  �������ַ�������   ע�� ����ֵ�����Ӻ���ַ���
		 * 	int indexOf(char)		����һ���ַ������Ƿ����ĳ�� �ַ�  ��  �ַ���
		 * 	int indexOf(String)	û�ҵ�-1 ��һ��λ��0
		 * 	int lastIndexOf(char)	���ַ����ĺ��濪ʼ��ĳ���ַ��� ���ַ�
		 * 	int lastIndexOf(String)	���ؽ�� ͬ��
		 * 	String substring(int)	��ָ��Ϊ��0��ʼ����ȡ������ �Ӵ�
		 * 	String substring(begin,end) ��ȡ�� begin ��  end ֮ǰ��������end
		 * 	String trim()	ȥ���ַ������˵Ŀո�
		 */
		System.out.println("hello".indexOf("o"));
		System.out.println("hello".substring(1));
		System.out.println("hellohello".substring(1,5));
		System.out.println("------------------------------");
		String str = "��ͤ�� �ŵ��� ���ݱ����� ���� ������ Ϧ��ɽ��ɽ";
		//ͨ���ո� ���ַ���str��ֳ�����
		String[] strArr = str.split(" ");
		for (String st : strArr) {
			System.out.println(st);
		}
	
	}

}
