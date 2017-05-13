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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_REZERWACJI")
    private Long id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATA")
    private Date date;
    @Column(name="KLIENT")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Reservation(Long id, String status, Date date) {
        this.id = id;
        this.status = status;
        this.date = date;
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
