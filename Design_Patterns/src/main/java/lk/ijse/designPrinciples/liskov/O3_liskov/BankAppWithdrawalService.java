package lk.ijse.designPrinciples.liskov.O3_liskov;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.custom.Withdrawable;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:35 PM
 **/
public class BankAppWithdrawalService {

    Withdrawable account;

    public BankAppWithdrawalService(Withdrawable account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(double amount){
        account.withdraw(amount);
    }

}
