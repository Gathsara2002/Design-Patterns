package lk.ijse.desingPatterns.creational.factory;

/**
 * @author : Gathsara
 * created : 11/22/2023 -- 5:46 PM
 **/

public class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }
}
