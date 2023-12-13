package lk.ijse.desingPatterns.behavioural.strategy;

/**
 * @author : Gathsara
 * created : 11/30/2023 -- 8:05 PM
 **/
public class Test {
    public static void main(String[] args) {

        //Initialize context
        Player player = new Player();

        //Set one strategy
        player.setMovement(new WalkStrategy());
        player.movePlayer();

        //set another strategy
        player.setMovement(new RunStrategy());
        player.movePlayer();

        /*in runtime both algorithms will select and give necessary output*/
    }
}
