//��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�

package ѭ�����;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		int a = 0, sum = 0, n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("��������a��ֵ�� ");
		a = s.nextInt();
		int m=a;
		System.out.println("������ӵ�������");
		n = s.nextInt();
		
		if(n==1)
			System.out.println("�ܺͣ�" + a);
		else if(n>=2) {
			for(int i=2;i<=n;i++) {
				a=a*10+m;
				sum = sum + a;
			}
			int b = sum + m;
			System.out.println("�ܺͣ�" + b);
		}
		else
			System.out.println("�������");
		
	}
}
