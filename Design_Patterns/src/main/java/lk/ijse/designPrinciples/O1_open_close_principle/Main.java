package lk.ijse.designPrinciples.O1_open_close_principle;

/**
 * @author : Gathsara
 * created : 12/1/2023 -- 10:04 PM
 **/
public class Main {
    public static void main(String[] args) {

        BankAppWithdrawalService bankAppWithdrawalService = new BankAppWithdrawalService();

        bankAppWithdrawalService.depositToCurrentAccount(100000);
        bankAppWithdrawalService.withdrawFromCurrentAccount(10000);

    }
}
