package creational.builder.firstType;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private double acceleration;
    private int mileage;
    private int price;

    private Car(String model, String color, int maxSpeed, double acceleration, int mileage, int price) {
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

    public static class CarBuilder {
        private String model;
        private String color;
        private int maxSpeed;
        private double acceleration;
        private int mileage;
        private int price;

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setAcceleration(double acceleration) {
            this.acceleration = acceleration;
            return this;
        }

        public CarBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(model, color, maxSpeed, acceleration, mileage, price);
        }
    }
}
