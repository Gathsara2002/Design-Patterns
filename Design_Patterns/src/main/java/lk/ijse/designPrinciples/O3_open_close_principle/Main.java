package lk.ijse.designPrinciples.O3_open_close_principle;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:00 PM
 **/
public class Main {

    /*SOLID*/
    /* O - Open / Close Principle */
    /*
     *This principle states that the software entities should be open for extensions but close
     * for modifications
     * */
    public static void main(String[] args) {

        BankAppWithdrawalService bankAppWithdrawalService = new BankAppWithdrawalService();

        bankAppWithdrawalService.depositToCurrentAccount(100000);
        bankAppWithdrawalService.withdrawFromCurrentAccount(5000);

        bankAppWithdrawalService.depositToSalarySaverAccount(200000);
        bankAppWithdrawalService.withdrawFromSalarySaverAccount(100000);
    }

}
