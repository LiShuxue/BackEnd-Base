package base;
import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 2, num3 = 3;
		double price1 =100 , price2 = 200, price3 = 300;
		String shirt = "T恤", shose = "网球鞋", racket = "网球拍";
		int num = 0;
		int count = 0;
		double discount = 1;
		double cost = 0, totleCost = 0;
		String choice = "";
		boolean flag = true;  
		
		Scanner input = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println(num1 + "." + shirt + "\t" + num2 + "." + shose + "\t" + num1 + "." + racket);
		System.out.println("**************************");
		
		while(flag) {
			System.out.print("请输入商品编号：");
			num = input.nextInt();
			System.out.print("请输入购买数量：");
			count = input.nextInt();
			switch(num){
			case 1:
				cost = price1*count;
				System.out.println(shirt + "$" + price1 + "\t" + "数量：" + count  + "\t" + "合计：" + "$" + cost);
				System.out.println();
				break;
			case 2:
				cost = price2*count;
				System.out.println(shose + "$" + price2 + "\t" + "数量：" + count  + "\t" + "合计：" + "$" + cost);
				System.out.println();
				break;
			case 3:
				cost = price3*count;
				System.out.println(racket + "$" + price3 + "\t" + "数量：" + count  + "\t" + "合计：" + "$" + cost);
				System.out.println();
				break;
			default:
				System.out.println("输入有误");
				break;
			}
			totleCost = totleCost + cost;
			System.out.print("是否继续（y/n）：");
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
		
		System.out.println("折扣：" + discount);
		System.out.println("打折前应付金额：" + totleCost);
		System.out.println("打折后应付金额：" + totleCost*discount);
		System.out.print("实付金额：");
		double money = input.nextInt();
		System.out.println("找钱：" + (money-totleCost*discount));
		
	}
}
