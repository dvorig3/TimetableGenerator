package com.luckers.timetable.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 27.04.15
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Week {
    public Week() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Week(int numberOfWeek, List<Timetable> timetables, Date dateStart) {
        this.numberOfWeek = numberOfWeek;
        this.timetables = timetables;
        this.dateStart = dateStart;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }


    public List<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<Timetable> timetables) {
        this.timetables = timetables;
    }

    public int getNumberOfWeek() {

        return numberOfWeek;
    }

    public void setNumberOfWeek(int numberOfWeek) {
        this.numberOfWeek = numberOfWeek;
    }


    @Id
    @GeneratedValue
    @Min(value = 0)
    private int id;

    @Min(value = 1)
    private int numberOfWeek;
    @NotNull
    private java.util.Date dateStart;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "classroom")
    private List<Timetable> timetables;
}
