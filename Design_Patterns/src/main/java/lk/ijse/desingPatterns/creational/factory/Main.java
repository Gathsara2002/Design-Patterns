package lk.ijse.desingPatterns.creational.factory;

/**
 * @author : Gathsara
 * created : 11/21/2023 -- 9:11 PM
 **/

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactoryImpl();

        Vehicle car = vehicleFactory.createVehicle("Car");
        car.drive();

        Vehicle bike = vehicleFactory.createVehicle("Bike");
        bike.drive();

    }
}
