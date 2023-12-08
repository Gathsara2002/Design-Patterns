package lk.ijse.designPrinciples.interface_segregation.O3_interface_segregation.service.types;

import lk.ijse.designPrinciples.interface_segregation.O3_interface_segregation.service.custom.Bank;

import java.util.List;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 5:38 PM
 **/
public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
        // Payment Initiate Logic
        System.out.println("Payment Initiated");
    }

    @Override
    public Object status() {
        // Status returning logic
        System.out.println("Status Called");
        return null;
    }

    @Override
    public List<Object> getPayments() {
        // Get all payments
        System.out.println("Returned all payments");
        return null;
    }

}
