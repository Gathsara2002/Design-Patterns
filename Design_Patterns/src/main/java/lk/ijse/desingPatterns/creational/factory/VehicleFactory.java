package lk.ijse.desingPatterns.creational.factory;

/**
 * @author : Gathsara
 * created : 11/22/2023 -- 5:43 PM
 **/

/*Factory interface - Use to declare object creation  method */

public interface VehicleFactory {
    Vehicle createVehicle(String type);
}
