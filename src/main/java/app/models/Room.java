package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Sala")
@IdClass(RoomPK.class)
public class Room  implements Serializable {

    @Id
    @Column(name="ID_BUDYNKU")
    private Long building;
    @Id
    @Column(name = "NUMER")
    private int number;
    @Column(name = "NAZWA")
    private String name;
    @Column(name = "OPIS")
    private String description;
    @Column(name = "TYP")
    private String type;

    public Room(){};
    public Room( int number, String type, Long building) {
        this.number = number;
        this.type = type;
        this.building = building;
    }

    public Long getBuilding() {
        return building;
    }

    public void setBuilding(Long building) {
        this.building = building;
    }

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getType() {
        return this.type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class RoomPK implements Serializable {
    protected Long building;
    protected int number;

    public RoomPK() {}

    public RoomPK(Long building,int number) {
        this.building = building;
        this.number = number;
    }
    // equals, hashCode
}