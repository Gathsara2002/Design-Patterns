package lk.ijse.desingPatterns.behavioural.observer.service.impl;

import lk.ijse.desingPatterns.behavioural.observer.service.Observer;
import lk.ijse.desingPatterns.behavioural.observer.service.Subject;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 11:03 AM
 **/
public class SubjectImpl implements Subject {

    ArrayList<Observer> allObservers = new ArrayList<>();

    @Override
    public void register(Observer ob) {
        allObservers.add(ob);
    }

    @Override
    public void unRegister(Observer ob) {
        allObservers.remove(ob);
    }

    @Override
    public void notifyAllObservers(String msg) {
        for (Observer observer : allObservers) {
            observer.update(msg);
        }
    }
}
