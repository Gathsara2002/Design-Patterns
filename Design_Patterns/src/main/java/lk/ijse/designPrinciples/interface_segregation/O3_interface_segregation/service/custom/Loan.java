package lk.ijse.designPrinciples.interface_segregation.O3_interface_segregation.service.custom;

import lk.ijse.designPrinciples.interface_segregation.O3_interface_segregation.service.Payment;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 5:39 PM
 **/
public interface Loan extends Payment {
    void initiateLoanSettlement();

    void initiateRePayment();
}
