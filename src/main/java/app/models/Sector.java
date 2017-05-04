package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Created by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Sektor")
public class Sector  implements Serializable {
    @Id
    @Column(name = "ID_SEKTORA")
    private Long id;
    @Column(name = "TYP")
    private String type;
    @Column(name = "OPIS")
    private String description;
    @Column(name="SALA")
    private int number;
    @ManyToOne
    @Column(name = "BUDYNEK")
    private Building building;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Sector(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
