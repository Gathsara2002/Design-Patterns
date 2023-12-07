package lk.ijse.designPrinciples.liskov.O3_liskov.service.custom;

import lk.ijse.designPrinciples.liskov.O3_liskov.service.Account;

/**
 * @author : Gathsara
 * created : 12/7/2023 -- 1:18 PM
 **/
public abstract class Withdrawable extends Account {
    public abstract void withdraw(double amount);
}
