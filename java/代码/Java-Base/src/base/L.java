package base;
import java.util.Scanner;

		
public class L {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String  a = input.next();
		System.out.print("�����빺���");
		double b = input.nextDouble();
		
		if(a.equals("y")) {
			if(b>=200) {
				b = b * 0.75;
			}
			else {
				b = b * 0.8;
			}
		}
		else {
			if(b>=100) {
				b = b * 0.9;
			}
		}
		System.out.println("ʵ��֧����" + b);
	}
}
