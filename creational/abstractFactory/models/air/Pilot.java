package creational.abstractFactory.models.air;

import creational.abstractFactory.models.Driver;
import creational.abstractFactory.models.Vehicle;

public class Pilot implements Driver {
    @Override
    public void moveToPoint(Vehicle vehicle, double latitude, double longitude) {
        if (!(vehicle instanceof Airplane)) {
            throw new RuntimeException("Vehicle not supported");
        }

        /*
         * Some realization
         */

        vehicle.move();
    }
}
