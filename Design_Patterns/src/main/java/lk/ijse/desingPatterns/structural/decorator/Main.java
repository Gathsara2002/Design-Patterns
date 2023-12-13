package lk.ijse.desingPatterns.structural.decorator;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 12:39 PM
 **/
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        RedShapeDecorator decorator = new RedShapeDecorator(circle);
        decorator.draw();

        RedShapeDecorator decorator1 = new RedShapeDecorator(square);
        decorator1.draw();
    }
}
