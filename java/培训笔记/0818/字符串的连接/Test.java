package com.zyw;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		//����ֵ�Ƿ���Ҫʹ�ö�Σ�
		System.out.println(t.graph(5, "*"));
	}
	
	/**
	 * ����ִ��ǰ��Ҫʲô�� ִ�к��Ƿ���Ҫ�������
	 * ����2����������ͼ��
	 * ���������ε�ͼ���ַ���
	 */
	public String graph(int rows,String ico){	//������ǩ��
		String img = "";	//���յ�ͼ��
		//���ַ�������һ��û���ַ����ݵġ��ַ�����
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				img += ico;	//����ÿһ�е�ͼ��
			}
			img += "\n";	//ÿ��ͼ�������������һ������
		}
		return img;	//*\n**\n***\n****\n*****\n
	}

}
