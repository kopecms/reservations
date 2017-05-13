package app.controllers;

import app.models.Client;
import app.models.Reservation;
import app.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api/reservations")
public class ReservationController{
    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping(value="", method= RequestMethod.GET)
    public Iterable<Reservation> getAllUsers() {
        return reservationRepository.findAll();
    }

    @RequestMapping(value="/create", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Reservation input) {
        this.reservationRepository
                .save(new Reservation(input.getId(), input.getStatus(), input.getDate()));
    }

}

