package creational.builder.firstType;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .setColor("Black")
                .setAcceleration(3.1)
                .setMaxSpeed(320)
                .setMileage(0)
                .setModel("Mercedes")
                .setPrice(150000)
                .build();


        System.out.println(car);
    }
}
