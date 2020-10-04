package com.github.uditnarayan.designpatterns.behavioral.observer;

public abstract class Observer {
    private final Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public abstract void update();
}
