package chouxiang;

public class DuoTai {
	
	
/**
 * 通过父类型代表子类型
 */
//	public static void main(String[] args) {
//		Person1 p = new Students2();
//		p.eat();
//		Person1 p2 = new Employees();
//		p2.eat();
//		
//		System.out.println("------------");
//		
//		Person1[] ps = {new Students2(), new Employees(), p, p2};
//		for(Person1 per : ps) {
//			per.eat();
//		}
//	}
	
	
/**
 * 方法参数，返回值的多态
 */
	public static void main(String[] args) {
		DuoTai d = new DuoTai();
		d.method01(new Employees());
		d.method02(1).eat();
	}
	
	public void method01(Person1 p) {     //参数是父类型，可以传入任意子类型
		p.eat();
	}
	
	public Person1 method02(int code) {      //返回值是父类型， 可以返回任意的子类型
		switch (code) {
		case 1:
			return new Students2();
		default:
			return new Employees();
		}
	}
}

class Person1{

	public void eat() {
		System.out.println("人类吃饭");
	}
}

class Students2 extends Person1{
	public void eat() {
		System.out.println("学生吃饭");
	}
}

class Employees extends Person1 {
	public void eat() {
		System.out.println("员工吃饭");
	}
}
