package lk.ijse.desingPatterns.creational.singleton;

/**
 * @author : Gathsara
 * created : 11/20/2023 -- 8:22 PM
 **/
public class Singleton {

    /*private instance*/
    private static Singleton singleton;

    /*private constructor*/
    private Singleton() {

    }

    /*public method get instance*/
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
