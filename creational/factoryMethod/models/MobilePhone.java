package creational.factoryMethod.models;

public abstract class MobilePhone {
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MobilePhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public abstract void showDescription();
}
