package app.controllers;

import app.generators.TestDataGenerator;
import app.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

/**
 * Created by kopec on 13.05.2017.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    TestDataGenerator testDataGenerator;

    @RequestMapping(value="/generate")
    @Transactional
    public void genereteData(){
        try {
            testDataGenerator.generateClients(20);
            testDataGenerator.generateReservation(40);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
