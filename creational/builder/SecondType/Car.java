package creational.builder.secondType;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private double acceleration;
    private int mileage;
    private int price;

    public Car(String model, String color, int maxSpeed, double acceleration, int mileage, int price) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}