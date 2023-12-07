package lk.ijse.designPrinciples.liskov.O3_liskov.service.types;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.custom.Withdrawable;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:37 PM
 **/
public class SalarySaverAccount extends Withdrawable {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Salary Saver Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from Salary Saver Account.!");
    }

}
