package 阶乘;
/*
 * 题目：利用递归方法求5!。
 */
public class Mul {
	public static void main(String[] args) {
		int n = 5;
		jiecheng j = new jiecheng();
		System.out.println(n+"! = "+j.jiecheng(n));
	}
	
}
class jiecheng{
	public long jiecheng(int n) {
		long value=0;
		if(1==n) {
			value = 1;
		}
		else{
			value = n * jiecheng(n-1);  //递归调用自身方法
		}
		return value;
	}
}
