package ������;

import java.util.Scanner;

/*
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
 */
public class Digit {
	public static void main(String[] args) {
		boolean c=false;
		System.out.print("������һ������");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		char[] b = a.toCharArray();
		
		if(b.length==1) {
			System.out.println(a + "���ǻ�����");
		}
		else{
			for(int i=0; i<b.length/2; i++) {
				if(b[i]==b[b.length-1-i]){
					c = true;
					continue;
				}
				else{
					c=false;
				}
			}
			if(c){
				System.out.println(a + "�ǻ�����");
			}
			else {
				System.out.println(a + "���ǻ�����");
			}
		}
		
	}
}
