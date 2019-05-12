package creational.prototype;

public class Prototype implements IPrototype {

    /*
     *
     *
     *
     * Some fields and methods
     *
     *
     *
     */

    @Override
    public IPrototype makeClone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
