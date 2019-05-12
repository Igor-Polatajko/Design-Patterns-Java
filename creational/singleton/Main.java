package creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonType1 singletonType1FirstRef = SingletonType1.getInstance();
        SingletonType1 singletonType1SecondRef = SingletonType1.getInstance();


        SingletonType2 singletonType2FirstRef = SingletonType2.getInstance();
        SingletonType2 singletonType2SecondRef = SingletonType2.getInstance();

        System.out.println(singletonType1FirstRef == singletonType1SecondRef); // both references are referencing the same object
        System.out.println(singletonType2FirstRef == singletonType2SecondRef); // both references are referencing the same object
    }
}
