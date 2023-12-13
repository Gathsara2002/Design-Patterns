package lk.ijse.desingPatterns.structural.decorator;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 12:32 PM
 **/

/*
 Component interface එකෙන් implement වුණු class.
Extend / modify කරන්න ඕන core functionality එක තියෙන්නෙ මේකෙ.
*/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
