package lk.ijse.desingPatterns.behavioural.strategy;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 11:58 AM
 **/
public class RunStrategy implements Movement {
    @Override
    public void move() {
        System.out.println("Running");
    }
}
