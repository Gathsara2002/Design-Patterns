package lk.ijse.designPrinciples.dependency_inversion.O1_di;

import lk.ijse.designPrinciples.dependency_inversion.O1_di.service.Boy;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 6:24 PM
 **/
public class Main {

    /* SOLID */
    /* Dependency Inversion Principle */
    /*
     * In this principle, it states that high level modules should not depend upon low level modules
     * Both should be depended upon abstraction.
     * This help us to develop loosely coupled code by ensuring that high-level modules depends on
     * abstraction rather than concrete implementations of lower-level modules.
     * The dependency injection pattern is an implementation of this principle.
     * */
    public static void main(String[] args) {

        Boy boy = new Boy(); //Boy is a High Level Class
        boy.chatWithGirl();
    }

}
