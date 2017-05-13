package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Bilet")
public class Ticket  implements Serializable {

    @Id
    @Column(name = "ID_BILETU")
    private Long id;
    @Column(name = "CENA")
    private float price;
    @Column(name = "Rezerwacja")
    private Reservation reservation;
    @Column(name = "Wydarzenie")
    private Event event;
    @Column(name = "Sektor")
    private Sector sector;
    @Column(name = "Miejsce")
    private Place place;
    @Column(name = "Budynek")
    private Building building;


    public Ticket(Long id, float price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public float getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}
