package creational.abstractFactory;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;
import creational.abstractFactory.models.air.Airplane;
import creational.abstractFactory.models.air.Pilot;

public class AirFactory implements TransportFactory {
    @Override
    public Vehicle getVehicle() {
        return new Airplane();
    }

    @Override
    public Driver getDriver() {
        return new Pilot();
    }
}
