package com.github.uditnarayan.designpatterns.behavioral.observer.impl;

import com.github.uditnarayan.designpatterns.behavioral.observer.Observer;
import com.github.uditnarayan.designpatterns.behavioral.observer.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Bin Format: " + Integer.toBinaryString(getSubject().getState()));
    }
}
