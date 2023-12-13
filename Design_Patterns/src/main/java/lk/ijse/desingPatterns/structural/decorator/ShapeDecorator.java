package lk.ijse.desingPatterns.structural.decorator;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 12:35 PM
 **/

/*
abstract class එකක් / interface එකක්.
මේකත් Component Interface එකෙන් implement වෙලා තියෙන්නෙ.

Component එකක් තියාගන්න පුලුවන් reference එකක් තියෙනො.
Component වල behaviors modify කරයි / අලුතින් add කරයි.

Concrete Decorators වලට common interface එකක් සපයයි.
 */

public abstract class ShapeDecorator implements Shape{

    protected Shape shape;

    // set the component to be decorated
    public ShapeDecorator(Shape decoratorShape) {
        this.shape = decoratorShape;
    }


    // Delegating the draw operation to the component
    public void draw() {
        shape.draw();
    }

}
