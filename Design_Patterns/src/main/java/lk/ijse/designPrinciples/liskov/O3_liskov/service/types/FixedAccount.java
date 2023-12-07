package lk.ijse.designPrinciples.liskov.O3_liskov.service.types;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.custom.Fixed;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 12:52 PM
 **/
public class FixedAccount extends Fixed {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Fixed Account.!");
    }

//    @Override
//    public void withdraw(double amount) {
//        System.out.println(amount + " Withdrawn from your Fixed Account.!");
//        throw new UnsupportedOperationException("Cannot Withdrawn money from fixed accounts");
//    }
    /* Ok. Eventually, here we have a trouble. */
    /* Fixed accounts cannot have a withdrawn option */
    /* So keep  in mind that */
}
