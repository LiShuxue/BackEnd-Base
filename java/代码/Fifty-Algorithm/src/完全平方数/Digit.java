package ��ȫƽ����;
/*
 * ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ���    
 * ��ȫƽ������һ�������Ա�ʾ��ĳ������ƽ������4.9.16.25.36.49....
 */

public class Digit {
	public static void main(String[] args) {
		for (int i=0; i<10000; i++) {
			if (Math.sqrt(i+100) % 1==0) {
				if (Math.sqrt(i+168) % 1==0) {
					System.out.println("������ǣ�" + i);
					
				}			
			}
		}	
	}
}
