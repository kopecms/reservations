package app.repositories;

import app.models.Event;
import app.models.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kopec on 29.04.2017.
 */

public interface EventRepository extends PagingAndSortingRepository<Event,Long>, CrudRepository<Event, Long> {
    @Query(" select p from Place p where p.sector = ?1")
    List<Place> findAllFreePlaces( Long id);
}
//CrudRepository<Event, Long>,
