package app.models;

import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
public class Ticket  implements Serializable {
    private Long id;
    private float price;

    public Ticket(Long id, float price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public float getPrice() {
        return this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
