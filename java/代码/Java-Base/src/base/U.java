package base;
import java.util.Scanner;


public class U {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int val = input.nextInt();
		System.out.println("�������ֵ����������¼ӷ���");
		for(int i=0,j=val; i<=val; i++,j--) {
			System.out.println(i + " + " + j + " = " + (i+j));
		}
	}
}
