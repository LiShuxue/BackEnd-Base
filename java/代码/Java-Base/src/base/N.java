package base;
import java.util.Scanner;


public class N {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double cost = input.nextInt();
		
		System.out.print("是否参加优惠换购活动(y/n)：");
		String isChoice = input.next();
		if(isChoice.equals("y")) {
			if(cost>=50) {
				System.out.println("1：满50元，加2元换购百事可乐饮料一瓶");
				System.out.println("2：满100元，加3元换购500ml可乐一瓶");
				System.out.println("3：满100元，加10元换购5公斤面粉");
				System.out.println("4：满200元，加10元换购一个苏泊尔炒菜锅");
				System.out.println("5：满200元，加20元换购欧莱雅爽肤水一瓶");
				System.out.println("0：不换购");
				System.out.print("请选择：");
				int choice = input.nextInt();
				
				switch(choice){
				case 1:
					System.out.println("本次消费金额：" + (cost+2));
					System.out.println("成功换购：百事可乐饮料一瓶");
					break;
				case 2:
					System.out.println("本次消费金额：" + (cost+3));
					System.out.println("成功换购：500ml可乐一瓶");
					break;
				case 3:
					System.out.println("本次消费金额：" + (cost+10));
					System.out.println("成功换购：5公斤面粉");
					break;
				case 4:
					System.out.println("本次消费金额：" + (cost+10));
					System.out.println("成功换购：一个苏泊尔炒锅");
					break;
				case 5:
					System.out.println("本次消费金额：" + (cost+20));
					System.out.println("成功换购：欧莱雅爽肤水一瓶");
					break;
				case 0:
					System.out.println("您未选择换购");
				}
			}
			else {
				System.out.println("您的消费不满足换购条件，再见。");
			}
		}
		else {
			System.out.println("感谢您的使用。");
		}
		
	}
}
