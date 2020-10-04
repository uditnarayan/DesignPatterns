package com.github.uditnarayan.designpatterns.behavioral.observer.impl;

import com.github.uditnarayan.designpatterns.behavioral.observer.Observer;
import com.github.uditnarayan.designpatterns.behavioral.observer.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Oct Format: " + Integer.toOctalString(getSubject().getState()));
    }
}
