package lk.ijse.desingPatterns.creational.factory;

/**
 * @author : Gathsara
 * created : 11/22/2023 -- 5:37 PM
 **/

/*This interface is super for all sub classes.
This is use to get common return type in factory method.
If you want to add any common methods that use in sub classes, add to this interface*/

public interface Vehicle {
    void drive();
}
