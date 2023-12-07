package lk.ijse.designPrinciples.open_close.O3_open_close_principle.service.types;

import lk.ijse.designPrinciples.open_close.O3_open_close_principle.service.Account;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:26 PM
 **/
public class SavingsAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }

}
