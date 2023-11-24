package lk.ijse.desingPatterns.structural.facade;

/**
 * @author : Gathsara
 * created : 11/24/2023 -- 6:54 PM
 **/

public class TestFacade {

    public static void main(String[] args) {
        Facade facade = new FacadeImpl();
        facade.drawCircle();
        facade.drawSquare();
    }
}
