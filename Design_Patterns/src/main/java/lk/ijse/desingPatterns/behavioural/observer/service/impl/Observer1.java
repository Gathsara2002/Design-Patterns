package lk.ijse.desingPatterns.behavioural.observer.service.impl;

import lk.ijse.desingPatterns.behavioural.observer.service.Observer;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 11:00 AM
 **/

public class Observer1 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Hi , Im observer 1 : " + msg);
    }
}
