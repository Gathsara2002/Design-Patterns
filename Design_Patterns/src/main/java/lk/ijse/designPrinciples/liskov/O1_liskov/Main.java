package lk.ijse.designPrinciples.liskov.O1_liskov;

import lk.ijse.designPrinciples.liskov.O1_liskov.service.Account;
import lk.ijse.designPrinciples.liskov.O1_liskov.service.types.CurrentAccount;
import lk.ijse.designPrinciples.liskov.O1_liskov.service.types.SalarySaverAccount;
import lk.ijse.designPrinciples.liskov.O1_liskov.service.types.SavingAccount;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:34 PM
 **/
public class Main {

    /*SOLID*/
    /* L - Liskov-Substitution Principle */
    /*
     * This principle states that the objects of a superclass shall be replaceable with
     * Objects of its subclasses without breaking the application
     *
     * */
    public static void main(String[] args) {

        /* According to Liskov-Substitution principle
         * objects of a superclass shall be replaceable with
         * Objects of its subclasses without breaking the application*/

        Account savingAccount = new SavingAccount();

        BankAppWithdrawalService bankAppWithdrawalService1 = new BankAppWithdrawalService(savingAccount);
        bankAppWithdrawalService1.depositToAccount(100000);
        bankAppWithdrawalService1.withdrawFromAccount(40000);

        /*Super class*/           /*Sub Class */
        Account currentAccount = new CurrentAccount();

        BankAppWithdrawalService bankAppWithdrawalService2 = new BankAppWithdrawalService(currentAccount);
        bankAppWithdrawalService2.depositToAccount(200000);
        bankAppWithdrawalService2.withdrawFromAccount(30000);


        /*Super class*/           /*Sub Class */
        Account salaryServer = new SalarySaverAccount();

        BankAppWithdrawalService bankAppWithdrawalService3 = new BankAppWithdrawalService(salaryServer);
        bankAppWithdrawalService3.depositToAccount(500000);
        bankAppWithdrawalService3.withdrawFromAccount(100000);

    }
}
