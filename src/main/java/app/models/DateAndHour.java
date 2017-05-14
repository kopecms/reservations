package app.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kopec on 03.05.2017.
 */
@Entity
@Table(name = "Data i goidzina")
public class DateAndHour {
    @Id
    @SequenceGenerator(name="DATE_SEQ", sequenceName="DATE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DATE_SEQ")
    @Column(name = "ID_HARMONOGRAMU")
    private Long timetableId;
    @Id
    @Column(name = "DATA")
    private Date date;
    @Column(name = "CZAS_TRWANIA")
    private int time;


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
