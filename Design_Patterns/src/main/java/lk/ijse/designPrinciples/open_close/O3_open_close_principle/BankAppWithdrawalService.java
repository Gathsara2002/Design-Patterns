package lk.ijse.designPrinciples.open_close.O3_open_close_principle;

import lk.ijse.designPrinciples.open_close.O3_open_close_principle.service.Account;

/**
 * @author : Gathsara
 * created : 12/5/2023 -- 5:21 PM
 **/
public class BankAppWithdrawalService {

    /*public void depositToSavingsAccount(double amount){
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    public void depositToCurrentAccount(double amount){
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    public void withdrawFromSavingsAccount(double amount){
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }

    public void withdrawFromCurrentAccount(double amount){
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }

    *//* I want to implement another feature for Banking App Withdrawal Service*//*

    public void depositToSalarySaverAccount(double amount){
        System.out.println(amount + " Deposited to your Salary Server Account.!");
    }

    public void withdrawFromSalarySaverAccount(double amount){
        System.out.println(amount + " Withdrawn from your Salary Server Account.!");
    }*/

    /* So here for adding a new feature I had to modify the class */
    /* So, unfortunately we have violated the Open / Close principle */
    /* Why.? */
    /* In Open/Close principle a class should be closed for modifications but opened for extensions */
    /* But here we did modifications rather than doing extensions */
    /* S0, we violate the rule */

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


    /*Open Close principle eka apply karanna ona nm -

     *adala class eke common method abstarct class ekakata danna.
     *avashya classes types e abstract class eken extend karanna.
     *open close principle eka danna ona class eke abstract class eken instance ekak ganna.
     *constructor eka overload karaganna

     */
}
