package lk.ijse.desingPatterns.behavioural.observer.service.impl;

import lk.ijse.desingPatterns.behavioural.observer.service.Observer;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 11:02 AM
 **/
public class Observer2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("Hi , Im observer 2 : " + msg);
    }
}
