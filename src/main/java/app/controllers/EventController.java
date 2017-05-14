package app.controllers;

import app.models.Building;
import app.models.Event;
import app.repositories.BuildingRepository;
import app.repositories.EventRepository;
import app.repositories.TimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    private Building building;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TimetableRepository timetableRepository;

    @Autowired
    private BuildingRepository buildingRepository;

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public Iterable<Event> getAllEvent() {
        return eventRepository.findAll();
    }


    @RequestMapping(value = "/test", method=RequestMethod.GET)
    public Event getAllBuildings() {
        return eventRepository.findOne(1l);
    }

    @RequestMapping(value = "/new", method=RequestMethod.GET)
    public String newEvent(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("building", buildingRepository.findAll());
        return "bookings/create";
    }

}