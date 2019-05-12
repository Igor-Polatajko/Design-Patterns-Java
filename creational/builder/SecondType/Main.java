package creational.builder.secondType;


public class Main {

    public static void main(String[] args) {
        Car car = new CarBuilder()
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
