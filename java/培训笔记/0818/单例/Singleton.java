package single;
/**
 * 单例设计模式
 * 特点：1.构造器是私有的    2.返回的对象都是同一个     3.对外提供一个静态方法     4.提高效率
 */

public class Singleton {    //单例类
	private String name;
	private static Singleton sin = new Singleton();
	
	private  Singleton() {    //私有的构造器
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Singleton getSin() {
		return sin;
	}

	public static void setSin(Singleton sin) {
		Singleton.sin = sin;
	}
	
	

	
}

