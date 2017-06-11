package base;
import java.util.Scanner;


public class X {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("请输入会员号（<4位整数>）：");
			String num = input.next();

			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			String birth = input.next();
			
			System.out.print("请输入会员积分：");
			int score = input.nextInt();
			if(num.length()==4) {
				System.out.println("您录入的会员信息是：");
				System.out.println(num + "\t" + birth + "\t" + score);
				System.out.println();
				continue;
			}
			else {
				System.out.println("客户号" + num + "是无效会员号码！" );
				System.out.println("录入信息失败");
				System.out.println();
			}
			
		}
		System.out.println("程序结束");
	}
}
