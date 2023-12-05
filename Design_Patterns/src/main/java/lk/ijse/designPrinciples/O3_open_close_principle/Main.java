package lk.ijse.designPrinciples.O3_open_close_principle;

import lk.ijse.designPrinciples.O3_open_close_principle.service.Account;
import lk.ijse.designPrinciples.O3_open_close_principle.service.types.AnagiAccount;
import lk.ijse.designPrinciples.O3_open_close_principle.service.types.CurrentAccount;
import lk.ijse.designPrinciples.O3_open_close_principle.service.types.SalarySaverAccount;
import lk.ijse.designPrinciples.O3_open_close_principle.service.types.SavingsAccount;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:21 PM
 **/
public class Main {

    /*SOLID*/
    /* O - Open / Close Principle */
    /*
     *This principle states that the software entities should be open for extensions but close
     * for modifications
     * */
    public static void main(String[] args) {

        /* Let's deposit for Savings Account Bank App Withdrawal Service */
        Account savingAccount= new SavingsAccount();
        BankAppWithdrawalService bankAppWithdrawalService1 = new BankAppWithdrawalService(savingAccount);
        bankAppWithdrawalService1.depositToAccount(100000);
        bankAppWithdrawalService1.depositToAccount(40000);


        Account currentAccount= new CurrentAccount();
        BankAppWithdrawalService bankAppWithdrawalService2 = new BankAppWithdrawalService(currentAccount);
        bankAppWithdrawalService2.depositToAccount(200000);
        bankAppWithdrawalService2.depositToAccount(30000);


        Account salaryServer= new SalarySaverAccount();
        BankAppWithdrawalService bankAppWithdrawalService3 = new BankAppWithdrawalService(salaryServer);
        bankAppWithdrawalService3.depositToAccount(500000);
        bankAppWithdrawalService3.depositToAccount(100000);

        /* This is what we called as Open / Close Principle */

        Account anagiAccount= new AnagiAccount();
        BankAppWithdrawalService bankAppWithdrawalService4= new BankAppWithdrawalService(anagiAccount);
        bankAppWithdrawalService4.withdrawFromAccount(100);
        bankAppWithdrawalService4.depositToAccount(2000);

    }

}
