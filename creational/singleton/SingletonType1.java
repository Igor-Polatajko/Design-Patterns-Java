package creational.singleton;

public class SingletonType1 {
    private static SingletonType1 ourInstance = new SingletonType1();

    public static SingletonType1 getInstance() {
        return ourInstance;
    }

    private SingletonType1() {
    }
}
