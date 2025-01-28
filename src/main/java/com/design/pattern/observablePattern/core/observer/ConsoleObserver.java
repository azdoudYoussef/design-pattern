package com.design.pattern.observablePattern.core.observer;

import com.design.pattern.observablePattern.model.Event;

public class ConsoleObserver implements Observer {
    @Override
    public void update(Event event) {
        System.out.println("ConsoleObserver: " + event.getMessage());
    }
}

