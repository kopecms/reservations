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
    @Column(name = "ID_WYDARZENIA")
    private Long id;

    private Building building;

    @Column(name = "ID_HARMONOGRAMU")
    private int timetable;

    @Column(name = "NAZWA")
    private String name;
    @Column(name = "ORGANIZATOR")
    private String organizer;
    @Column(name = "OPIS")
    private String description;

    public Event(){};

    public Event(Long id, String name, String organizer, int timetable) {
        this.id = id;
        this.name = name;
        this.organizer = organizer;
        this.timetable = timetable;
    }
    public int getTimetable() {
        return timetable;
    }

    public void setTimetable(int timetable) {
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
