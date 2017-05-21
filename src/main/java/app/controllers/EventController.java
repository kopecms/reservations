package app.controllers;

import app.models.*;
import app.repositories.*;
import app.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    private Building building;

    @Autowired
    private EventService eventService;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TimetableRepository timetableRepository;

    @Autowired
    private SectorRepository sectorRepository;

    @Autowired
    private PriceRepository priceRepository;

    @RequestMapping(value="", method=RequestMethod.GET)
    Page<Event> listEvents(Pageable pageable){
        Page<Event> events = eventService.listAllByPage(pageable);
        return events;
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    void createEvent(@RequestBody Event input){
        this.eventRepository.save(input);
    }

    @RequestMapping(value="timetables",method = RequestMethod.GET)
    public Iterable<Timetable> getTimetables() {
        return timetableRepository.findAll();
    }

    @RequestMapping(value="sectors",method = RequestMethod.GET)
    public Iterable<Sector> getEvents() {
        return sectorRepository.findAll();
    }

    @RequestMapping(value="price", method = RequestMethod.POST)
    void createPrice(@RequestBody Price input){
        this.priceRepository.save(input);
    }

    //@RequestMapping(value="sectors",method = RequestMethod.GET)
/*
    todo
    znizki
*/
}