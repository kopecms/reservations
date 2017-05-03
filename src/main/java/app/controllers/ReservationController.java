package app.controllers;

import app.models.Reservation;
import app.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}