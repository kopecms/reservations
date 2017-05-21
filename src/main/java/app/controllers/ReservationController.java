package app.controllers;

import app.models.*;
import app.repositories.*;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by kopec on 29.04.2017.
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/reservations")
public class ReservationController{

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SectorRepository sectorRepository;

    @Autowired
    private TimetableRepository timetableRepository;

    @RequestMapping(value="", method= RequestMethod.GET)
    public Iterable<Reservation> getAllUsers() {
        return reservationRepository.findAll();
    }
    
}

