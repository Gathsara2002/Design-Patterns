package lk.ijse.designPrinciples.dependency_inversion.O2_di.service;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 6:35 PM
 **/

public class Boy {
    SuperGirl girl = new Girl(); // property injection

    public void chatWithGirl() {
        //Girl girl = new Girl(); // Violate DI Principle
        // Now both depend on abstraction
        girl.chat();
    }
    /*The classes which are performing tasks with the help of other classes are known as High Level Classes
     * Boy class is using the help of Girl class to perform chat with girl task
     * So boy is a High Level Class.
     *
     * So what Dependency Inversion Principle Emphasize on.?
     * High level modules should not depend upon low level modules. So here we are violating it.
     *
     * So, then what we should do.?
     * Both should depend upon abstraction
     * */
}
