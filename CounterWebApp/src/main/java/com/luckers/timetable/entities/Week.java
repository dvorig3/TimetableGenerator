package com.luckers.timetable.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 27.04.15
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class Week {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Id @GeneratedValue

    @Min(value = 0)
    private int id;
    @Min(value = 1)
    private int number;
    @NotNull
    private java.util.Date dateStart;


}
