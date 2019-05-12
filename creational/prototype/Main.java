package creational.prototype;

public class Main {

    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory();

        Prototype prototype1 = new Prototype(); // creating 1-st object
        Prototype prototype2 = (Prototype) cloneFactory.getClone(prototype1); // creating 2-nd object as clone of first


        System.out.println(System.identityHashCode(prototype1));
        System.out.println(System.identityHashCode(prototype2));
    }
}
