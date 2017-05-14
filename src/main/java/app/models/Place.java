package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Miejsce")
public class Place  implements Serializable {
    @Id
    @SequenceGenerator(name="PLACE_SEQ", sequenceName="PLACE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PLACE_SEQ")
    @Column(name = "ID_MIEJSCA")
    private Long id;
    @Column(name = "NUMER")
    private int number;
    @Column(name = "ID_SEKTORA")
    private Long sector;
    @Column(name = "ID_RZEDU")
    private int rowId;

    public Place(int number, Long sector, int rowId) {
        this.number = number;
        this.sector = sector;
        this.rowId = rowId;
    }

    public Long getSector() {
        return sector;
    }

    public void setSector(Long sector) {
        this.sector = sector;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
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
