package app.models;

import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Created by abuczak on 30.04.2017.
 */
public class Sector  implements Serializable {
    private Long id;
    private String type;
    private String description;

    public Sector(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return this.id;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
