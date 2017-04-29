package app.controllers;

import java.util.List;

import app.models.Urzytkownik;
import app.repositories.UserRepository;
import app.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<Urzytkownik> getAllUsers() {
        return userRepository.getAll();
    }
}