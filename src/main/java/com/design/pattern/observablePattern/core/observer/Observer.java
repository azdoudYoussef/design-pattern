package com.design.pattern.observablePattern.core.observer;

import com.design.pattern.observablePattern.model.Event;

public interface Observer {
    void update(Event event);
}

