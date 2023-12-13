package lk.ijse.desingPatterns.behavioural.observer.service;

/**
 * @author : Gathsara
 * created : 12/13/2023 -- 10:53 AM
 **/

public interface Subject {
    void register(Observer ob);

    void unRegister(Observer ob);

    void notifyAllObservers(String msg);
}
