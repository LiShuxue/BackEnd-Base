package singleton;


public class Singleton {
    
    private static Singleton sing;

    private Singleton() {
        //私有构造器
    }
    
    public static Singleton getInstance() {
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }
}
