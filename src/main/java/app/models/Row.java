package app.models;

import javax.persistence.*;

/**
 * Created by kopec on 14.05.2017.
 */
public class Row {
    @Id
    @SequenceGenerator(name="ROW_SEQ", sequenceName="ROW_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ROW_SEQ")
    @Column(name="ID_SEKTORA")
    private Long building;
    @Id
    @Column(name = "NUMER")
    private int number;

    public Row(int number) {
        this.number = number;
    }

    public Long getBuilding() {
        return building;
    }

    public void setBuilding(Long building) {
        this.building = building;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
