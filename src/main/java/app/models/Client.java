package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Klient")
public class Client  implements Serializable {

    @Id
    @SequenceGenerator(name="clients_seq", sequenceName="CLIENTS_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="clients_seq")
    @Column(name = "ID_KLIENTA")
    private Long id;
    @Column(name = "IMIE")
    private String firstName;
    @Column(name = "NAZWISKO")
    private String lastName;
    @Column(name = "ADRES_EMAIL")
    private String email;

    public Client(){}

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Client getUser() {
        return new Client(this.firstName, this.lastName, this.email);
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
