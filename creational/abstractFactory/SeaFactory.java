package creational.abstractFactory;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;
import creational.abstractFactory.models.sea.Ship;
import creational.abstractFactory.models.sea.Steersman;

public class SeaFactory implements TransportFactory {
    @Override
    public Vehicle getVehicle() {
        return new Ship();
    }

    @Override
    public Driver getDriver() {
        return new Steersman();
    }
}
