package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name ="Harmonogram")
public class Timetable  implements Serializable {
    @Id
    @SequenceGenerator(name="TIMETABLE_SEQ", sequenceName="TIMETABLE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TIMETABLE_SEQ")
    @Column(name = "ID_HARMONOGRAMU")
    private Long id;
    @Column(name = "TYP")
    private String type;

    public Timetable(String type) {
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
