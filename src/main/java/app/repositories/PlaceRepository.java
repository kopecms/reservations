package app.repositories;

import app.models.Place;
import app.models.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kopec on 14.05.2017.
 */
public interface PlaceRepository extends CrudRepository<Place,Long> {
}
