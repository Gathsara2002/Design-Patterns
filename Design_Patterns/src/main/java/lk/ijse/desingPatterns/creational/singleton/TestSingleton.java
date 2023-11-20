package lk.ijse.desingPatterns.creational.singleton;

/**
 * @author : Gathsara
 * created : 11/20/2023 -- 8:35 PM
 **/
public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1==instance2);
    }
}
