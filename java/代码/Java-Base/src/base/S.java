package base;
import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 2, num3 = 3;
		double price1 =100 , price2 = 200, price3 = 300;
		String shirt = "T��", shose = "����Ь", racket = "������";
		int num = 0;
		int count = 0;
		double discount = 1;
		double cost = 0, totleCost = 0;
		String choice = "";
		boolean flag = true;  
		
		Scanner input = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println(num1 + "." + shirt + "\t" + num2 + "." + shose + "\t" + num1 + "." + racket);
		System.out.println("**************************");
		
		while(flag) {
			System.out.print("��������Ʒ��ţ�");
			num = input.nextInt();
			System.out.print("�����빺��������");
			count = input.nextInt();
			switch(num){
			case 1:
				cost = price1*count;
				System.out.println(shirt + "$" + price1 + "\t" + "������" + count  + "\t" + "�ϼƣ�" + "$" + cost);
				System.out.println();
				break;
			case 2:
				cost = price2*count;
				System.out.println(shose + "$" + price2 + "\t" + "������" + count  + "\t" + "�ϼƣ�" + "$" + cost);
				System.out.println();
				break;
			case 3:
				cost = price3*count;
				System.out.println(racket + "$" + price3 + "\t" + "������" + count  + "\t" + "�ϼƣ�" + "$" + cost);
				System.out.println();
				break;
			default:
				System.out.println("��������");
				break;
			}
			totleCost = totleCost + cost;
			System.out.print("�Ƿ������y/n����");
			choice = input.next();
			
			if(choice.equals("y")) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		if(totleCost>=5000) {
			discount = 0.7;
		}
		else if(totleCost>=1500) {
			discount = 0.8;
		}
		else if(totleCost>500) {
			discount = 0.9;
		}
		else {
			discount = 1;
		}
		
		System.out.println("�ۿۣ�" + discount);
		System.out.println("����ǰӦ����" + totleCost);
		System.out.println("���ۺ�Ӧ����" + totleCost*discount);
		System.out.print("ʵ����");
		double money = input.nextInt();
		System.out.println("��Ǯ��" + (money-totleCost*discount));
		
	}
}
