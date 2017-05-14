package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "BUDYNEK")
public class Building  implements Serializable {
    @Id
    @SequenceGenerator(name="BUILDING_SEQ", sequenceName="BUILDING_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="BUILDING_SEQ")
    @Column(name = "ID_BUDYNKU")
    private Long id;
    @Column(name = "ADRES")
    private String address;
    @Column(name = "TYP")
    private String type;
    @Column(name = "OPIS")
    private String description;

    public Building(){};

    public Building(String address, String type) {
        this.id = id;
        this.address = address;
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
