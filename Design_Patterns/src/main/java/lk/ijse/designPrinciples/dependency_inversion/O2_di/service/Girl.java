package lk.ijse.designPrinciples.dependency_inversion.O2_di.service;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 6:35 PM
 **/
public class Girl extends SuperGirl {
    /* This is a low level class, because this class functions are used by another class called Boy*/
    @Override
    public void chat() {
        System.out.println("Hello there...D");
    }
}
