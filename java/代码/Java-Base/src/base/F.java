package base;

public class F {
	public static void main(String[] args) {
		int day = 46;
		int week = 0;
		int day2 = 0;
		week = day/7;
		day2 = day%7;
		System.out.println("46天是" + week + "周余" + day2 +"天");
	}
}
