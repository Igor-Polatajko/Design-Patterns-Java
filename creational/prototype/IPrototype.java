package creational.prototype;

public interface IPrototype extends Cloneable {
    IPrototype makeClone() throws CloneNotSupportedException;
}
