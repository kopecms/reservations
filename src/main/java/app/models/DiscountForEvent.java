package app.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kopec on 03.05.2017.
 */
@Entity
@Table(name = "Zniżka do wydarzenia")
public class DiscountForEvent {

    public DiscountForEvent() {
    }

    @Id
    @Column(name = "Wydarzenie")
    private Event event;

    @Column(name = "Zniżka")
    private Discount discount;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
