package app.models;

import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
public class Place  implements Serializable {
    private Long id;
    private int number;

    public Place(Long id, int number) {
        this.id;
        this.number = number;
    }

    public Long getId() {
        return this.id;
    }

    public int getNumber() {
        return this.number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
