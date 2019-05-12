package creational.factoryMethod.models;

public class Huawei extends MobilePhone {

    public Huawei(String model, String color) {
        super(model, color);
    }

    @Override
    public void showDescription() {
        System.out.println("Huawei " + this.getModel() + " (" + this.getColor() + ")");
    }
}
