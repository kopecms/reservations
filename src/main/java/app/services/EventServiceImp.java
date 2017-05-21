package app.services;

import app.models.Event;
import app.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by kopec on 21.05.2017.
 */
@Service
@Transactional
public class EventServiceImp implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public Page<Event> listAllByPage(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }
}
