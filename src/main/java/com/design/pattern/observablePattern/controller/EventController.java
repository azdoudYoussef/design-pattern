package com.design.pattern.observablePattern.controller;
import com.design.pattern.observablePattern.service.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public String createEvent(@RequestParam String message) {
        eventService.publishEvent(message);
        return "Event published: " + message;
    }
}

