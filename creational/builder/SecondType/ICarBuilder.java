package creational.builder.secondType;

public interface ICarBuilder {
    CarBuilder setModel(String model);

    CarBuilder setColor(String color);

    CarBuilder setMaxSpeed(int maxSpeed);

    CarBuilder setAcceleration(double acceleration);

    CarBuilder setMileage(int mileage);

    CarBuilder setPrice(int price);

    Car build();
}
