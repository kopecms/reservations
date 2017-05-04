package app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Miejsce")
public class Place  implements Serializable {
    @Id
    @Column(name = "ID_MIEJSCA")
    private Long id;
    @Column(name = "NUMER")
    private int number;
    @Column(name = "SEKTOR")
    private Sector sector;
    @Column(name = "BUDYNEK")
    private Building building;

    public Place(Long id, int number) {
        this.id = id;
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
