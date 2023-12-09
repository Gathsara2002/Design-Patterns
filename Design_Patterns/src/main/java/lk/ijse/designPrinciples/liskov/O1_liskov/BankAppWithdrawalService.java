package lk.ijse.designPrinciples.liskov.O1_liskov;

import lk.ijse.designPrinciples.liskov.O1_liskov.service.Account;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:35 PM
 **/
public class BankAppWithdrawalService {

    Account account;

    public BankAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void depositToAccount(double amount) {
        account.deposit(amount);
    }

    public void withdrawFromAccount(double amount) {
        account.withdraw(amount);
    }

}
