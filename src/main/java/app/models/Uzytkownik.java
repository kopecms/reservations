package app.models;

import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 */

public class Uzytkownik implements Serializable {


    private Long id;

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