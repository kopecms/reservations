package app.models;

import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
public class Event  implements Serializable {
    private Long id;
    private String name;
    private String organizer;
    private String description;

    public Event(Long id, String name, String organizer) {
        this.id = id;
        this.name = name;
        this.organizer = organizer;
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
