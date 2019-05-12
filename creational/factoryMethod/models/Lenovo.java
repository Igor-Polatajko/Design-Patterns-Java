package creational.factoryMethod.models;

public class Lenovo extends MobilePhone {

    public Lenovo(String model, String color) {
        super(model, color);
    }

    @Override
    public void showDescription() {
        System.out.println("Lenovo " + this.getModel() + " (" + this.getColor() + ")");
    }
}
