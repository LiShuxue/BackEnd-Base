package chouxiang;

public class ChouXiangLei {

	public static void main(String[] args) {
		//B b = new B();        //抽象类不能被实例化
		
		A a = new A();
		a.eat();
		a.run();
		
		B a1 = new A();          //也可以用多态形式
		a1.eat();
		a1.run();
		
	}
}

abstract class B{            //抽象类
	public abstract void eat();
	
	public void run() {
		System.out.println("奔跑");
	}
}

class A extends B {
	public void eat() {         //重写父类的方法，将父类未实现的抽象方法实现
		System.out.println("吃饭");
	}
}