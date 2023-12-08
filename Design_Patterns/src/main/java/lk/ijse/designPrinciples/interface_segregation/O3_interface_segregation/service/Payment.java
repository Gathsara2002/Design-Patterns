package lk.ijse.designPrinciples.interface_segregation.O3_interface_segregation.service;

import java.util.List;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 5:37 PM
 **/
public interface Payment {

    //void initiatePayments();
    Object status();

    List<Object> getPayments();

    /* Introduce new features for the payments */
    //void initiateLoanSettlement();
    //void initiateRePayment();

}
