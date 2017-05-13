package app.controllers;

import app.models.Event;
import app.repositories.EventRepository;
import app.repositories.TimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TimetableRepository timetableRepository;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public Iterable<Event> getAllEvent() {
        return eventRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Event input) {
        this.eventRepository
                .save(new Event(input.getId(),input.getName(),input.getOrganizer(),2));
    }

}