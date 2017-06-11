package Test1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog targetDog = new DogImpl();
		Object proxy = MyProxyFactory.getProxy(targetDog);

		Dog dog = null;
		if (proxy instanceof Dog) {
			dog = (Dog) proxy;
		}
		dog.info();
		dog.run();

	}
}
