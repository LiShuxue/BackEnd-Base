
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingle();
		s1.setName("tom");
		Singleton s2 = Singleton.getSingle();
		System.out.println(s2.getName());

	}

}
