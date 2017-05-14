package app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Rezerwacja")
public class Reservation  implements Serializable {
    @Id
    @SequenceGenerator(name="RESERVATIONS_SEQ", sequenceName="RESERVATIONS_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RESERVATIONS_SEQ")
    @Column(name = "ID_REZERWACJI")
    private Long id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATA")
    private Date date;

    @Column(name="ID_KLIENTA")
    private Long clientId;
    public Reservation(){}

    public Reservation(String status, Date date, Long clientId) {
        this.status = status;
        this.date = date;
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }


    public Long getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public Date getDate() {
        return this.date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
