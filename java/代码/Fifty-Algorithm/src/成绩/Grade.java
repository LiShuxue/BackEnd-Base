//��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 

package �ɼ�;

import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ѧ���ĳɼ�(0-100)��");
		int n = s.nextInt();
		char grade = n>= 90 ? 'A' : n>= 60 ? 'B' : 'C';     //���������������
		System.out.print("ѧ���ȼ���" + grade);
//		if(n>=90) {
//			System.out.print("ѧ���ȼ���");
//			System.out.println("A");
//		}
//			
//		else if(60<=n && n<=89) {
//			System.out.print("ѧ���ȼ���");
//			System.out.println("B");
//		}
//			
//		else {
//			System.out.print("ѧ���ȼ���");
//			System.out.println("C");
//		}
		
					
	}

}
