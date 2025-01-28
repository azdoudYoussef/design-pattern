package com.design.pattern.observablePattern.service;
import com.design.pattern.observablePattern.core.observable.EventSource;
import com.design.pattern.observablePattern.core.observer.ConsoleObserver;
import com.design.pattern.observablePattern.core.observer.EmailObserver;
import com.design.pattern.observablePattern.model.Event;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventSource eventSource = new EventSource();

    public EventService() {
        eventSource.addObserver(new ConsoleObserver());
        eventSource.addObserver(new EmailObserver());
    }

    public void publishEvent(String message) {
        Event event = new Event(message);
        eventSource.notifyObservers(event);
    }
}
