package chouxiang;

public class JiCheng {
	public static void main(String[] args) {
		Students s = new Students();
		s.eat();
		s.run();
		s.study();
	}
}

class Person{
	protected String name;      //protected 同包，子类可用
	protected int age;
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void run() {
		System.out.println("奔跑");
	}
	
}

class Students extends Person{
	private int sid;
	
	public void study() {
		System.out.println("学习");
	}
}


/**
 * 类中如果写了一个带参数的构造，虚拟机就不会再添加无参构造了，这时，如果一个类继承了这个类，而子类里面又没有写构造方法，会编译失败
	这时就不能实例化子类，因为实例化子类时会在子类的默认构造方法中第一行先super（），而父类又没有无参构造
 *
 */
//class A{
//	
//	A(int i){
//		
//	}
//}
//class B extends A{
//	
//}
	
	

