package lk.ijse.designPrinciples.interface_segregation.O1_interface_segregation.service;

import java.util.List;

/**
 * @author : Gathsara
 * created : 12/8/2023 -- 5:19 PM
 **/

public interface Payment {
    void initiatePayments();

    Object status();

    List<Object> getPayments();
}
