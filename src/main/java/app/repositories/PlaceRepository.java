package app.repositories;

import app.models.Place;
import app.models.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by kopec on 14.05.2017.
 */
public interface PlaceRepository extends CrudRepository<Place,Long> {
    @Query(" select p from Place p where p.sector = ?1")
    List<Place> findAllFreePlaces( Long id);
}
