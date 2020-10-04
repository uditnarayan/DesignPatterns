package com.github.uditnarayan.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;

    private final List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
