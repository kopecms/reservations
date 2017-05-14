package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 14.05.2017.
 */
@Entity
@Table(name = "RZAD")
@IdClass(RowPK.class)
public class Row {
    @Id
    @Column(name="ID_SEKTORA")
    private Long building;
    @Id
    @Column(name = "NUMER")
    private int number;
    public Row () {}
    public Row(int number, Long building) {
        this.number = number; this.building = building;
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
class RowPK implements Serializable {
    protected Long building;
    protected int number;

    public RowPK() {}

    public RowPK(Long building,int number) {
        this.building = building;
        this.number = number;
    }
    // equals, hashCode
}