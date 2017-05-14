package app.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kopec on 29.04.2017.
 * Implemented by abuczak on 30.04.2017.
 */
@Embeddable
@Table(name = "Zniżka")
public class Discount  implements Serializable {

    @Id
    @SequenceGenerator(name="DISCOUNT_SEQ", sequenceName="DISCOUNT_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DISCOUNT_SEQ")
    @Column(name = "ID_ZNIŻKI")
    private Long id;
    @Column(name = "WARTOŚĆ")
    private float value;
    @Column(name = "TYP")
    private String type;
    @Column(name = "OPIS")
    private String description;

    public Discount(Long id, float value, String type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public float getValue() {
        return this.value;
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

    public void setValue(float value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
