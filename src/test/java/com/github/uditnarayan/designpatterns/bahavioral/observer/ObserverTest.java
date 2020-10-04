package com.github.uditnarayan.designpatterns.bahavioral.observer;

import com.github.uditnarayan.designpatterns.behavioral.observer.Subject;
import com.github.uditnarayan.designpatterns.behavioral.observer.impl.BinaryObserver;
import com.github.uditnarayan.designpatterns.behavioral.observer.impl.HexObserver;
import com.github.uditnarayan.designpatterns.behavioral.observer.impl.OctalObserver;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        int[] values = {0, 2, 8, 16, 10, 1124, 397};
        for (int value : values) {
            System.out.println(value + " in different format:");
            subject.setState(value);
            System.out.println("");
        }
    }
}
