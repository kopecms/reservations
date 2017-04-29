package app.controllers;

import app.models.User;
import app.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kopec on 29.04.2017.
 */
@RestController
@RequestMapping("/api")
public class EventController {
    @Autowired
    private EventRepository userRepository;



}