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
    @SequenceGenerator(name="TICKET_SEQ", sequenceName="TICKET_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TICKET_SEQ")
    @Column(name = "ID_BILETU")
    private Long id;
    @Column(name = "CENA_PO_ZNIZCE")
    private float price;
    @Column(name = "Znizka_id_znizki")
    private Long discountId;
    @Column(name = "ID_REZERWACJI")
    private Long reservation;
    @Column(name = "ID_WYDARZENIA")
    private Long sector;
    @Column(name = "ID_MIEJSCA")
    private Long place;
    public Ticket (){}
    public Ticket(float price, Long reservation, Long sector, Long place) {
        this.price = price;
        this.reservation = reservation;
        this.sector = sector;
        this.place = place;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getReservation() {
        return reservation;
    }

    public void setReservation(Long reservation) {
        this.reservation = reservation;
    }

    public Long getSector() {
        return sector;
    }

    public void setSector(Long sector) {
        this.sector = sector;
    }

    public Long getPlace() {
        return place;
    }

    public void setPlace(Long place) {
        this.place = place;
    }
}
