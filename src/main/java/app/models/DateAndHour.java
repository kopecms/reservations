package app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by kopec on 03.05.2017.
 */
@Entity
@Table(name = "Data i goidzina")
public class DateAndHour {
    @Column(name = "DATA ROZPOCZĘCIA")
    private Date date;
    @Column(name = "GODZINA ROZPOCZĘCIA")
    private Date hour;
    @Column(name = "CZAS TRWANIA")
    private int time;
    @Column(name = "ID_HARMONOGRAMU")
    private Timetable timetable;

    public DateAndHour(Date date, Date hour){
        this.date=date;
        this.hour=hour;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
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

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
}
