package app.repositories;

import app.models.Client;
import app.models.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kopec on 29.04.2017.
 */
public interface ReservationRepository extends CrudRepository<Reservation,Long>{


}
