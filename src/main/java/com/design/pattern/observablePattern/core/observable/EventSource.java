package com.design.pattern.observablePattern.core.observable;

import com.design.pattern.observablePattern.core.observer.Observer;
import com.design.pattern.observablePattern.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventSource {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Event event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}

