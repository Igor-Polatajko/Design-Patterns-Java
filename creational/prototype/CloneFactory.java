package creational.prototype;

public class CloneFactory {
    public IPrototype getClone(IPrototype prototype) {
        IPrototype clonedPrototype = null;

        try {
            clonedPrototype = prototype.makeClone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedPrototype;
    }
}
