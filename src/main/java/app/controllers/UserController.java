package app.controllers;

import app.models.Client;
import app.repositories.UserRepository;
import app.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {
    private Client client;

    public void setUser() {

    }

    public Client getUser() {
        return new Client();
    }

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value="", method=RequestMethod.GET)
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value="/save")
    @Transactional
    public void save(){
        userRepository.save(new User(new Long(1),"siema"));
    }

}