package lk.ijse.designPrinciples.open_close.O3_open_close_principle.service.types;

import lk.ijse.designPrinciples.open_close.O3_open_close_principle.service.Account;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:25 PM
 **/
public class CurrentAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }

}
