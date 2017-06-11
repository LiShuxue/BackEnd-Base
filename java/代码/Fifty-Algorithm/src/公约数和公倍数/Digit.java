//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。   
/**在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。**/

package 公约数和公倍数;
import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		int m,n,b,c;
		System.out.println("请输入一个正整数m：");
		Scanner s1 = new Scanner(System.in);
		m = s1.nextInt();
		System.out.println("请再输入一个正整数n：");
		n = s1.nextInt();
		
		GongYueShu G = new GongYueShu();
		b = G.GongYue(m, n);
		c = m * n / b;
		System.out.println(m + "和" + n + "的最大公约数是：" + b);
		System.out.println(m + "和" + n + "的最小公倍数是：" + c);
		
		s1.close();

	}

}
class GongYueShu {
	GongYueShu() {
		
	}
	public int GongYue(int x, int y) {
		int a;
		if(x<y) {
			a=y;
			y=x;
			x=a;
		}
		while(y!=0) {
			if(x==y)
				return x;
			else {
				int k = x % y; 
				x=y;
				y=k;
			}
		}
		return x;		
	}
}
