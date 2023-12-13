package lk.ijse.desingPatterns.structural.decorator;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 12:37 PM
 **/

/*
Concrete Decorators
Base decorator එකෙන් extend වෙලා තියෙන concrete subclasses.
Specific behavior add කරයි. Multiple decorators වලින් complex behavior combinations add කරන්න පුලුවන්.
*/

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    // Overrides the draw method to add additional behavior (setting red  border)
    @Override
    public void draw() {
        shape.draw(); // Delegating to the component
        setRedBorder(shape);
    }


    // Additional behavior specific to this decorator
    public void setRedBorder(Shape redBorder) {
        System.out.println("Border color: RED");
    }

}
