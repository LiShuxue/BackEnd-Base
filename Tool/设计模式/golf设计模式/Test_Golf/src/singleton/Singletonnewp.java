package singleton;



public class Singletonnewp {
	private static Singletonnewp _instance = new Singletonnewp();

	public static Singletonnewp getInstance() {
		return _instance;
	}
}