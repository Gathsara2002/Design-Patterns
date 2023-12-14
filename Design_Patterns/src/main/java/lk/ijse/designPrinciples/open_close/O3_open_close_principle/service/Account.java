package lk.ijse.designPrinciples.open_close.O3_open_close_principle.service;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:22 PM
 **/
public abstract class Account {

    /* Extract the basic services and place them here */
    /* Make it abstract because there is nothing to implement here */
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

}
