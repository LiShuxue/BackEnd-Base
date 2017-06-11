package zjjlive.proxy;

public class TestDog {
	public static void main(String[] args) {
		// Ŀ�����
		Dog targetObject = new DogImpl();
		Dog dog = null;
		Object proxy = MyProxyFactory.getProxy(targetObject);
		if (proxy instanceof Dog) {
			dog = (Dog) proxy;
		}
		dog.info();
		dog.run();
	}
}
