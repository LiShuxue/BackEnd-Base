package chouxiang;

public class ChongZai {

	public static void main(String[] args) {
		ChongZai c = new ChongZai();
	}
	
	public void method() {
		
	}
	//个数不同
	public void method(float n) {

	}
	//类型不同
	public void method(double m) {
		
	}
	
	//顺序不同
	public void method(int n,double m) {
		
	}
	
	public void method(double m, int n) {
		
	}
	
	//返回值不同，且参数不同
	public int method(int n) {
		return n;	
	}
}
