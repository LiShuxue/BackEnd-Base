package adapter;

public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void adapteeMethod() {
		adaptee.adapteeMethod();
		// System.out.println("Adaptee method!");
	}

	public void adapterMethod() {
		System.out.println("Adapter method!");
	}
}