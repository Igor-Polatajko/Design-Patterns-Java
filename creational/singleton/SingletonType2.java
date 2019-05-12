package creational.singleton;

public class SingletonType2 {
    private static SingletonType2 ourInstance;

    public static synchronized SingletonType2 getInstance() {
        if (ourInstance == null) {
            ourInstance = new SingletonType2();
        }
        return ourInstance;
    }

    private SingletonType2() {
    }
}
