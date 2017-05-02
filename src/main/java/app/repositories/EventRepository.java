package app.repositories;

import app.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kopec on 29.04.2017.
 */

public interface EventRepository extends CrudRepository<Event, Long> {
}
