package app.repositories;

import app.models.Timetable;
import app.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kopec on 03.05.2017.
 */
public interface TimetableRepository extends CrudRepository<Timetable, Long> {
}
