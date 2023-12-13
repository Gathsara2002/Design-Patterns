package lk.ijse.desingPatterns.behavioural.strategy;

/**
 * @author : Gathsara
 * created : 11/29/2023 -- 9:02 PM
 **/

//Context - that use strategy

public class Player {

    private Movement movement;

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void movePlayer(){
        movement.move();
    }
}
