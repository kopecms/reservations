package app.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Cena")
public class Price  implements Serializable {

    @Id
    @SequenceGenerator(name="PRICE_SEQ", sequenceName="PRICE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PRICE_SEQ")
    @Column(name = "WARTOSC")
    private float value;
    @Column(name = "WALUTA")
    private String currency;
    @Column(name = "ID_WYDARZENIA")
    private Long eventId;

    @Column(name = "ID_BUDYNKU")
    private Long buildingtId;
    @Column(name = "ID_SEKTORA")
    private Long sectortId;

    public Price(float value, String currency, Long eventId, Long buildingtId, Long sectortId) {
        this.value = value;
        this.currency = currency;
        this.eventId = eventId;
        this.buildingtId = buildingtId;
        this.sectortId = sectortId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getBuildingtId() {
        return buildingtId;
    }

    public void setBuildingtId(Long buildingtId) {
        this.buildingtId = buildingtId;
    }

    public Long getSectortId() {
        return sectortId;
    }

    public void setSectortId(Long sectortId) {
        this.sectortId = sectortId;
    }

    public float getValue() {
        return this.value;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
