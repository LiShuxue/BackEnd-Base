package �ַ������Ⱥ�����;

import java.util.Scanner;

/*
 * ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡� 
 */
public class Length {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������λ����������");
		String a = input.nextLine();
		int b = a.length();
		System.out.println("����"+b+"λ��");
		char[] ch= a.toCharArray();
		System.out.print("���������ǣ�");
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
