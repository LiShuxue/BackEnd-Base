package base;
import java.util.Scanner;
public class K {
	public static void main(String[] args) {
		System.out.print("������򣩣�");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		if(a>=500) {
			System.out.println("��������");
		}
		else if(a>=100) {
			System.out.println("��ɳ��");
		}
		else if(a>=50) {
			System.out.println("������");
		}
		else if(a>=10) {
			System.out.println("����");
		}
		else {
			System.out.println("�ݰ���");
		}
	}
}
