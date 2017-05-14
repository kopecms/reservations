package app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kopec on 03.05.2017.
 */
class DatePK implements Serializable {
    protected Long id;
    protected Date date;

    public DatePK() {}

    public DatePK(Long id, Date date) {
        this.id = id;
        this.date = date;
    }
    // equals, hashCode
}

@Entity
@Table(name = "Data_i_godzina")
public class DateAndHour implements Serializable{
    @Id
    @Column(name = "ID_HARMONOGRAMU")
    private Long timetableId;
    @Column(name = "DATA")
    private Date date;
    @Column(name = "CZAS_TRWANIA")
    private int time;
    public DateAndHour (){}

    public DateAndHour(Date date, int time, Long timetableId){
        this.date=date;
        this.time = time;
        this.timetableId = timetableId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Long getTimetable() {
        return timetableId;
    }

    public void setTimetable(Long timetable) {
        this.timetableId = timetable;
    }
}
