package com.design.pattern.observablePattern.core.observer;

import com.design.pattern.observablePattern.model.Event;

public class EmailObserver implements Observer {
    @Override
    public void update(Event event) {
        System.out.println("EmailObserver: Sending email with message - " + event.getMessage());
    }
}

