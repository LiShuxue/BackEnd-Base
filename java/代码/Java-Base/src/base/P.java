package base;
import java.util.Scanner;


public class P {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�ϸ�����y/n����");
		String isPast = input.next();
		
		while(!isPast.equals("y")) {
			System.out.println("1....");
			System.out.println("2....");
			System.out.println("3....");
			System.out.println("4....");
			System.out.print("�ϸ�����y/n����");
			isPast = input.next();
		}
		System.out.println("���ѧϰ����");
	}
}
