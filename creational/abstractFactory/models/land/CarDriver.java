package creational.abstractFactory.models.land;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;

public class CarDriver implements Driver {
    @Override
    public void moveToPoint(Vehicle vehicle, double latitude, double longitude) {
        if (!(vehicle instanceof Car)) {
            throw new RuntimeException("Vehicle not supported");
        }

        /*
         * Some realization
         */

        vehicle.move();
    }
}
