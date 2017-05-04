package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 */
@Entity
@Table(name = "Użytkownik")
public class Uzytkownik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_UŻYTKOWNIKA")
    private Long id;
    @Column(name = "NAZWA")
    private String username;

    public Uzytkownik() {

    }

    public Uzytkownik(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
