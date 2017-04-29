package app.repositories;

import app.models.Client;
import app.models.Reservation;

import java.util.List;

/**
 * Created by kopec on 29.04.2017.
 */
public interface ReservationRepository {

    void createReservation(Reservation reservation);

    List<Reservation> getClientReservation(Client client);
}
