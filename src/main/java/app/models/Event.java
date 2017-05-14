package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Wydarzenie")
public class Event  implements Serializable {
    @Id
    @SequenceGenerator(name="EVENT_SEQ", sequenceName="EVENT_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="EVENT_SEQ")
    @Column(name = "ID_WYDARZENIA")
    private Long id;
    @Column(name = "ID_HARMONOGRAMU")
    private Long timetable;
    @Column(name = "NAZWA")
    private String name;
    @Column(name = "ORGANIZATOR")
    private String organizer;
    @Column(name = "OPIS")
    private String description;

    public Event(){};

    public Event(String name, String organizer, Long timetable) {
        this.name = name;
        this.organizer = organizer;
        this.timetable = timetable;
    }
    public Long getTimetable() {
        return timetable;
    }

    public void setTimetable(Long timetable) {
        this.timetable = timetable;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
