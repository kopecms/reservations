package app.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kopec on 03.05.2017.
 */
@Entity
@Table(name = "Zniżka do wydarzenia")
public class DiscountForEvent {


    @Id
    @Column(name = "Wydarzenie")
    private Long event;

    @Column(name = "Zniżka")
    private Long discount;
    public DiscountForEvent () {}
    public DiscountForEvent(Long event, Long discount) {
        this.event = event;
        this.discount = discount;
    }
    public Long getEvent() {
        return event;
    }

    public void setEvent(Long event) {
        this.event = event;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }
}
