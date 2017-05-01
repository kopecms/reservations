package app.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
public class Reservation  implements Serializable {
    private Long id;
    private String status;
    private Date date;

    public Reservation(Long id, String status, Date date) {
        this.id = id;
        this.status = status;
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public Date getDate() {
        return this.date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
