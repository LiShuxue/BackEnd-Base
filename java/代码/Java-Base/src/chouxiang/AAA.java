package chouxiang;

public class AAA {
	public static void main(String[] args) {
		T t = new T();
		System.out.println(t.toString());
		T t2 = new T(10);
		System.out.println(t2.toString());
	}
}

class T {
	private int age;
	
	public T() {
		
	}
	public T(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.getClass().getName() + "[age = " + age + "]";
	}
}