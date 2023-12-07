package lk.ijse.designPrinciples.open_close.O1_open_close_principle;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 4:36 PM
 **/
public class BankAppWithdrawalService {

    public void depositToSavingAccount(double amount) {
        System.out.println(amount + " Deposited to your saving account");
    }

    public void depositToCurrentAccount(double amount) {
        System.out.println(amount + " Deposited to your current account");
    }

    public void withdrawFromSavingAccount(double amount) {
        System.out.println(amount + " Withdraw from your saving account");
    }

    public void withdrawFromCurrentAccount(double amount) {
        System.out.println(amount + " Withdraw from your current account");
    }

}
