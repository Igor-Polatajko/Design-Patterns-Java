package creational.factoryMethod.models;

public class IPhone extends MobilePhone {

    public IPhone(String model, String color) {
        super(model, color);
    }

    @Override
    public void showDescription() {
        System.out.println("IPhone " + this.getModel() + " (" + this.getColor() + ")");
    }
}
