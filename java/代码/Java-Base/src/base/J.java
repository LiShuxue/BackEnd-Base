package base;
import java.util.Scanner;


public class J {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入会员号：");
		String num = input.next();
		
		J j = new J();
		j.isRight(num);
	}
	
	public void isRight(String num) {
		if(num.length() == 4  && new J().isNum(num)) {
			System.out.println("合法");
		}
		else {
			System.out.println("不合法");
		}
	}
	
	public boolean isNum(String str) {
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
