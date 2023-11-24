package lk.ijse.desingPatterns.structural.facade;

/**
 * @author : Gathsara
 * created : 11/24/2023 -- 6:48 PM
 **/

/*facade impl*/
public class FacadeImpl implements Facade {

    private final Circle circle;
    private final Square square;

    public FacadeImpl() {
        square = new Square();
        circle = new Circle();
    }

    @Override
    public void drawCircle() {
        circle.draw();
    }

    @Override
    public void drawSquare() {
        square.draw();
    }
}
