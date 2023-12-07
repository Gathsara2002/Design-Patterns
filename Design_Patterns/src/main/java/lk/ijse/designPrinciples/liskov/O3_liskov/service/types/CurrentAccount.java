package lk.ijse.designPrinciples.liskov.O3_liskov.service.types;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.custom.Withdrawable;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:36 PM
 **/
public class CurrentAccount extends Withdrawable {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }
}
