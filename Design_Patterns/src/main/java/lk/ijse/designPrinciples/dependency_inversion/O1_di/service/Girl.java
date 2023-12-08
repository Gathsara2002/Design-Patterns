package lk.ijse.designPrinciples.dependency_inversion.O1_di.service;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 6:25 PM
 **/
public class Girl {

    /* This is a low level class, because this class functions are used by another class called Boy*/
    public void chat() {
        System.out.println("Hello there...D");
    }

}
