package app.services;

import app.models.Event;
import app.models.Place;
import app.repositories.EventRepository;
import app.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kopec on 21.05.2017.
 */
@Service
@Transactional
public class EventServiceImp implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    PlaceRepository placeRepository;

    @Override
    public Page<Event> listAllByPage(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }
    @Override
    public Iterable<Place> listFreePlaces(Long id){
        Event event = eventRepository.findOne(id);
        return eventRepository.findAllFreePlaces(event.getId());
    }
}
