package app.controllers;

import app.models.Event;
import app.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public Iterable<Event> getAllEvent() {
        return eventRepository.findAll();
    }

}