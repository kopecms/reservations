package app.services;

import app.models.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by kopec on 21.05.2017.
 */
public interface EventService {
    Page<Event> listAllByPage(Pageable pageable);
}
