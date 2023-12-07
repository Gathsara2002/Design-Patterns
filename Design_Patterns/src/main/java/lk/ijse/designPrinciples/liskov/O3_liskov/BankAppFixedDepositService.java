package lk.ijse.designPrinciples.liskov.O3_liskov;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.custom.Fixed;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 1:21 PM
 **/
public class BankAppFixedDepositService {


    Fixed account;

    public BankAppFixedDepositService(Fixed account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }

}
