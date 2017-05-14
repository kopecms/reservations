package app.generators;

import app.models.*;
import app.repositories.*;
import com.sun.corba.se.spi.legacy.interceptor.IORInfoExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.TicketFlags;

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
    int index;

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
    @Autowired
    private DateAndHourRepository dateAndHourRepository;
    @Autowired
    private RowRepository rowRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private TicketRepository ticketRepository;

    public void generateTickets(int number) throws IOException{

        List<Reservation> reservations = (List) reservationRepository.findAll();
        List<Event> events = (List) eventRepository.findAll();
        List<Place> places = (List) placeRepository.findAll();

        System.out.println("bielty");
        for(int i=0; i<number; ++i){
            float price = randomGenerator.nextFloat()*100;
            int k = i%events.size();
            int p = i%reservations.size();
            int q = i%places.size();
            ticketRepository.save(new Ticket(price,reservations.get(p).getId(),events.get(k).getId(),places.get(q).getId()));
        }

        System.out.println("Success");
    }

    public void generateEvents(int number) throws IOException{
        List<Timetable> timetables = (List) timetableRepository.findAll();
        List<String> names = readFile("names.txt");
        List<String> surnames = readFile("surnames.txt");

        System.out.println("wydarzenia");
        for (int i = 0; i <number; ++i) {
            index = randomGenerator.nextInt(names.size());
            String name = names.get(index);
            index = randomGenerator.nextInt(surnames.size());
            String surname = surnames.get(index);
            Long timetableId = timetables.get(i).getId();
            eventRepository.save(new Event("WYDARZENIE "+i,name+" "+surname,timetableId));
        }

        System.out.println("Success");
    }
    public void generateBuildings(int number) throws IOException{
        List<String> streets = readFile("streets");
        List<String> types = new ArrayList<String>();
        types.add("KINO");
        types.add("TEATR");
        types.add("HALA KONCERTOWA");
        types.add("INNE");

        System.out.println("budynki");
        for(int i = 0; i < number; ++i){
            index = randomGenerator.nextInt(streets.size());
            String name = streets.get(index);
            int n = randomGenerator.nextInt(200)+1;
            index = randomGenerator.nextInt(types.size());
            String type = types.get(index);
            buildingRepository.save(new Building("ul. "+name+" "+n,type));
        }

        List<Client> buildings = (List) buildingRepository.findAll();
        types = new ArrayList<String>();
        types.add("KONFERENCYJNA");
        types.add("SCENA");
        types.add("SALA KINOWA");
        types.add("INNE");

        System.out.println("sale");
        for(int i = 0; i < buildings.size(); ++i){
            Long buildingId = buildings.get(i).getId();
            for(int j = 0; j<6; ++j) {
                index = randomGenerator.nextInt(types.size());
                String type = types.get(index);
                roomRepository.save(new Room(j,type, buildingId));
            }
        }

        List<Room> rooms = (List) roomRepository.findAll();
        types = new ArrayList<String>();
        types.add("VIP");
        types.add("REGULAR");
        types.add("DLA NIEPELNOSPRAWNYCH");
        types.add("INNE");


        System.out.println("sektory");
        for(int i = 0; i < 6*2*number; ++i) {
            index = randomGenerator.nextInt(types.size());
            String type = types.get(index);
            Long buildingId = buildings.get(i/12).getId();
            int k = i%12;
            sectorRepository.save(new Sector(type,buildingId,k));
        }
        List<Sector> sectors = (List) sectorRepository.findAll();

        System.out.println("rzedy");
        for(int i = 0 ; i < 10*sectors.size(); ++i){
            rowRepository.save(new Row(i));
        }
        List<Row> rows = (List) rowRepository.findAll();

        System.out.println("miejsca");
        for(int i = 0; i < sectors.size(); ++i){
            Long sectorId = sectors.get(i).getId();
            for(int j= 0; j <rows.size(); ++j){
                for(int k = 0; k < 10; ++k){
                    placeRepository.save(new Place(k,sectorId,j));
                }
            }
        }
        System.out.println("Success");
    }
    public void generateTimeTables(int number) throws IOException{
        List<String> types = new ArrayList<String>();
        types.add("JEDNO DNIOWY");
        types.add("REGULARNY");
        for(int i = 0; i < number; ++i){
            index = randomGenerator.nextInt(types.size());
            String type = types.get(index);
            timetableRepository.save(new Timetable(type));
        }
        List<Timetable> timetables = (List) timetableRepository.findAll();
        for(int i = 0; i < number; ++i){
            index = randomGenerator.nextInt(timetables.size());
            Long timetable = timetables.get(index).getId();
            int time = randomGenerator.nextInt(100) + 45;
            dateAndHourRepository.save(new DateAndHour(new Date(),time,timetable));
        }
        System.out.println("Success");
    }

    public void generateClients(int number) throws IOException{
        List<String> names = readFile("names.txt");
        List<String> surnames = readFile("surnames.txt");
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
