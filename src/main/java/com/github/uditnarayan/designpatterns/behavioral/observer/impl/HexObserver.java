package com.github.uditnarayan.designpatterns.behavioral.observer.impl;

import com.github.uditnarayan.designpatterns.behavioral.observer.Observer;
import com.github.uditnarayan.designpatterns.behavioral.observer.Subject;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hex Format: " + Integer.toHexString(getSubject().getState()));
    }
}
