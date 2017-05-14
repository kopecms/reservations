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
    @SequenceGenerator(name="SECTOR_SEQ", sequenceName="SECTOR_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SECTOR_SEQ")
    @Column(name = "ID_SEKTORA")
    private Long id;
    @Column(name = "TYP")
    private String type;
    @Column(name = "DODATKOWE_INFORMACJE")
    private String description;
    @Column(name="ID_BUDYNKU")
    private Long number;
    @Column(name="NUMER_SALI")
    private int roomNumber;

    public Sector(String type, Long number, int roomNumber) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.number = number;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
