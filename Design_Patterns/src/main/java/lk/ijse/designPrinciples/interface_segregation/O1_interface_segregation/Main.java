package lk.ijse.designPrinciples.interface_segregation.O1_interface_segregation;

import lk.ijse.designPrinciples.interface_segregation.O1_interface_segregation.service.Payment;
import lk.ijse.designPrinciples.interface_segregation.O1_interface_segregation.service.types.BankPayment;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 5:18 PM
 **/

public class Main {

    /* SOLID  */
    /* I - Interface Segregation Principle */

    /*
     * This principle states that clients should not be forced to depend upon interfaces that
     * they don't use
     * */

    public static void main(String[] args) {

        Payment payment = new BankPayment();
        payment.initiatePayments();
        payment.status();
        payment.status();
        payment.getPayments();
    }
}
