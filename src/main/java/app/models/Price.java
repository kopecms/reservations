package app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Entity
@Table(name = "Cena")
public class Price  implements Serializable {

    @Id
    @Column(name = "WARTOŚĆ")
    private float value;
    @Column(name = "WALUTA")
    private String currency;

    public Price(float value, String currency) {
        this.value = value;
        this.currency = currency;
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
