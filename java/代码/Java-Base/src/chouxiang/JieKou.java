package chouxiang;

public class JieKou{
	public static void main(String[] args) {
		C c = new C("lisi");
		c.work();
		c.conquetry();
		c.study();
		
		System.out.println("==========");
		Is s1 = c;    //多态。   此时s1只能调Is中的方法，而不能调其他接口中的
		s1.study();
//		s1.work();
//		s1.conquetry()
		
		//同理，c也可以多态到其他接口类型
		Is2 s2 = c;
		Is3 s3 = c;   //此时也是只可以实现对应的接口的方法
		
		System.out.println("-----------");
		//JieKou这个类中的method方法，需要的参数是那个接口类型的，而我们穿进去的是一个实现了多个接口的类的对象，根据多态，是可以的
		new JieKou().method(c);  
		
		
		System.out.println("***********");
		//同理，我们也可以穿进去这个接口类型的对象
		Is3 ii = new C();
		new JieKou().method(ii);  
	}	
	
	public void method(Is3 s) {      //参数需要是Is3类型的对象
		s.work();
	}
}

class C implements Is,Is2,Is3{    //学生类
	private String name;

	public C(String name) {
		super();
		this.name = name;
	}

	public C(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void work() {
		System.out.println("工作");
		
	}

	@Override
	public void conquetry() {
		System.out.println("撒娇");
		
	}

	@Override
	public void study() {
		System.out.println("学习");
		
	}

	
}

interface Is {    //学生角色，学习方法
	//public abstract void study();
	void study();
}

interface Is2 {   //儿子角色，撒娇方法
	void conquetry();
}

interface Is3 {
	void work(); //员工角色，工作方法
}