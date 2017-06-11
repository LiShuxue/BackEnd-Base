package single;


public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getSin();
		s1.setName("tom");
		System.out.println(s1.getName());
		
		Singleton s2 = Singleton.getSin();
		System.out.println(s2.getName());

	}

}
