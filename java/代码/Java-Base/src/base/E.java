package base;
import java.util.Scanner;


public class E {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("STB�ĳɼ��ǣ�");
		double STB = input.nextInt();
		
		System.out.print("Java�ĳɼ��ǣ�");
		double Java = input.nextInt();
		
		System.out.print("SQL�ĳɼ��ǣ�");
		double SQL = input.nextInt();
		
		System.out.println("----------------------");
		System.out.println("STB \t Java \t SQL");
		System.out.println(STB + "\t " + Java + "\t " + SQL);
		System.out.println("----------------------");
		
		System.out.println("Java��SQL�ĳɼ��" + (Java - SQL) );
		System.out.println("3�ſε�ƽ���֣�" + (STB + Java + SQL)/3 );

	}
}
