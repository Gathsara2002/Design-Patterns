package lk.ijse.desingPatterns.behavioural.observer;

import lk.ijse.desingPatterns.behavioural.observer.service.Subject;
import lk.ijse.desingPatterns.behavioural.observer.service.impl.Observer1;
import lk.ijse.desingPatterns.behavioural.observer.service.impl.Observer2;
import lk.ijse.desingPatterns.behavioural.observer.service.impl.SubjectImpl;

/**
 * @author : Gathsara
 * created : 12/11/2023 -- 8:33 PM
 **/

public class Test {
    public static void main(String[] args) {

        //Initialize subject
        Subject subject = new SubjectImpl();

        //Initialize observers
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        //register observers to subject
        subject.register(observer1);
        subject.register(observer2);

        subject.notifyAllObservers("Hi");
        subject.notifyAllObservers("2nd message");
    }
}
