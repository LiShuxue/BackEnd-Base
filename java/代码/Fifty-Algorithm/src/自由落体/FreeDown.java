package ��������;
/*
 * ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
 * �����£������ڵ�10�����ʱ�������������� 
 * ��10�η������  
 */

public class FreeDown {
	public static void main(String[] args) {
		double h=100;
		double s=0;
		double h1=0;
		for (int i=1; i<=10; i++) {
			s=s+2*h1;
			h=h/2;
			h1=h;
			
		}

		System.out.println("����10�ξ�����·�̣�"+(s+100));
		System.out.println("��10�η����ĸ߶ȣ�"+h);
	}

}
