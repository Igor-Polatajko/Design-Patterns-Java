package creational.abstractFactory;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;

public interface TransportFactory {
    Vehicle getVehicle();
    Driver getDriver();
}
