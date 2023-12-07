package lk.ijse.designPrinciples.liskov.O2_liskov.service.types;

import lk.ijse.designPrinciples.liskov.O2_liskov.service.Account;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:37 PM
 **/
public class SavingAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }
}
