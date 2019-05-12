package creational.abstractFactory;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;

public class Main {
    public static void main(String[] args) {

        // Usage of abstract factory
        // We use land transport factory, that supplies us with right vehicle and driver
        TransportFactory transportFactory = new LandFactory();

        Driver driver = transportFactory.getDriver();
        Vehicle vehicle = transportFactory.getVehicle();

        driver.moveToPoint(vehicle, 37.3700, -122.0400);
    }
}
