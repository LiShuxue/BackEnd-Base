package com.zyw;
public class Test {

	public static void main(String[] args) {
		/**
		 * Java ��װ��
		 */
		//1.ͨ����װ��Ĺ��죬���� "���" (װ��)
		int num = 200;	//��Ҫ���������͵�num ת����������
		Integer num2 = new Integer(num);
			//�����ǲ���Ҳ���ԡ����������
		int num3 = num2.intValue();	//����ǲ��
		//���Ͼ��ǽ� ���� תΪ����  ��  ������תΪ  �����Ĺ���
		//Ϊʲô��Ҫ�����
			//1.����תΪ�������ͣ����������еı����Ͷ��Ƕ����ˡ��������Ƕ���oop���������
			//2.������û�� ���� ��  �����ģ�����������ӵ�У����������ˡ�
		//ͨ���ַ�������Integer
		Integer num4 = new Integer("100");
		
		//Integer�ľ�̬���� parseInt(String s) ���ַ���ת��Ϊ����
		Integer num5 = Integer.parseInt("200");
		//-------------------------------------------------------------
		//Java�ṩ���Զ��Ĵ�� �����
		//���Ը����׵Ľ�intֵ תΪ Integer���෴ Ҳ���Խ�IntegerתΪint
		Integer num6 = 100;	//�Զ����
		int num7 = num6;	//�Զ����
		//��IntegerתΪ�ַ���
		String s1 = num6.toString();
		String s2 = num6 + "";
		//-------------------------------������װ��
		Short myShort = 10;
		Byte myByte = 10;
		Long myLong = 10L;
		Float myFloat = 10.1F;
		Double myDouble = 19.9;
		Boolean myBoolean = true;
		Character myCharacter = 'c';
	}

}

