package �׳�;
/*
 * ��Ŀ�����õݹ鷽����5!��
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
			value = n * jiecheng(n-1);  //�ݹ����������
		}
		return value;
	}
}
