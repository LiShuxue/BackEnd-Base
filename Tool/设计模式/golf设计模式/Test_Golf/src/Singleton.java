public class Singleton {

	private static Singleton single = new Singleton();
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Singleton() {

	}

	public static Singleton getSingle() {
		return single;
	}
}
