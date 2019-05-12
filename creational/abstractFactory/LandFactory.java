package creational.abstractFactory;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;
import creational.abstractFactory.models.land.Car;
import creational.abstractFactory.models.land.CarDriver;

public class LandFactory implements TransportFactory{
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public Driver getDriver() {
        return new CarDriver();
    }
}
