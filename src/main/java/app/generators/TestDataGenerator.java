package app.generators;

import app.models.Client;
import app.models.Reservation;
import app.models.User;
import app.repositories.*;
import com.sun.corba.se.spi.legacy.interceptor.IORInfoExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by kopec on 02.05.2017.
 */
@Component
public class TestDataGenerator {
    String resourcesDir = "resources/";
    Random randomGenerator = new Random();

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

    public void generateClients(int number) throws IOException{
        List<String> names = readFile("names.txt");
        List<String> surnames = readFile("surnames.txt");
        System.out.println(names+" " +surnames);
        int index;
        for(int i = 0; i < number; ++i){
            index = randomGenerator.nextInt(names.size());
            String name = names.get(index);
            index = randomGenerator.nextInt(surnames.size());
            String surname = surnames.get(index);
            clientRepository.save(new Client(name,surname,surname+"@gmail.com"));
        }
        System.out.println("Success");
     }

     public void generateReservation(int number) throws IOException{
         List<Client> clients = (List) clientRepository.findAll();
         System.out.println(clients);
         int index;
         for(int i = 0; i < number; ++i){
             index = randomGenerator.nextInt(clients.size());
             reservationRepository.save(new Reservation("POTWIERDZONA",new Date(),(Long)clients.get(index).getId()));
         }
         System.out.println("Success");
     }
     List<String> readFile(String filename) throws IOException{
             Scanner sc = new Scanner(new FileReader(resourcesDir + filename));
             List<String> lines = new ArrayList<String>();
             while( sc.hasNext() )
                 lines.add(sc.next());
             return lines;
     }

    public static void main(){
        try {
            TestDataGenerator test = new TestDataGenerator();
            test.generateClients(5);

        }catch(Exception e){

        }
    }

}
