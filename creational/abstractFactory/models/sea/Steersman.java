package creational.abstractFactory.models.sea;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;

public class Steersman implements Driver {
    @Override
    public void moveToPoint(Vehicle vehicle, double latitude, double longitude) {
        if (!(vehicle instanceof Ship)) {
            throw new RuntimeException("Vehicle not supported");
        }

        /*
         * Some realization
         */

        vehicle.move();
    }
}
