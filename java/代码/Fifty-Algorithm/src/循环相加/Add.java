//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。

package 循环相加;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		int a = 0, sum = 0, n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("输入数字a的值： ");
		a = s.nextInt();
		int m=a;
		System.out.println("输入相加的项数：");
		n = s.nextInt();
		
		if(n==1)
			System.out.println("总和：" + a);
		else if(n>=2) {
			for(int i=2;i<=n;i++) {
				a=a*10+m;
				sum = sum + a;
			}
			int b = sum + m;
			System.out.println("总和：" + b);
		}
		else
			System.out.println("输入错误");
		
	}
}
