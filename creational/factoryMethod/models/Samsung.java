package creational.factoryMethod.models;

public class Samsung extends MobilePhone {

    public Samsung(String model, String color) {
        super(model, color);
    }

    @Override
    public void showDescription() {
        System.out.println("Samsung " + this.getModel() + " (" + this.getColor() + ")");
    }
}
