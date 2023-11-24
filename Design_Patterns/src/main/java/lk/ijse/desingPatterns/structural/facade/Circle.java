package lk.ijse.desingPatterns.structural.facade;

/**
 * @author : Gathsara
 * created : 11/24/2023 -- 6:46 PM
 **/

/*subsystem classes*/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
