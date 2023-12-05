package lk.ijse.designPrinciples.O3_open_close_principle.service.types;

import lk.ijse.designPrinciples.O3_open_close_principle.service.Account;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:27 PM
 **/
public class SalarySaverAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Salary Saver Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from Salary Saver Account.!");
    }

}
