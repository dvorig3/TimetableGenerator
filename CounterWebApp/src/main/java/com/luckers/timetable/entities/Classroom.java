package com.luckers.timetable.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 27.04.15
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
public class Classroom {
    @Id @GeneratedValue
    @Min(value=0)
    private int id;
    @Min(value=1)
    private int building;
    @Min(value=1)
    private int classroom;
    @Min(value=1)
    private int spaciousness;


    public Classroom(int id, int building, int classroom, int spaciousness) {
        this.id = id;
        this.building = building;
        this.classroom = classroom;
        this.spaciousness = spaciousness;
    }

    public int getSpaciousness() {
        return spaciousness;

    }

    public void setSpaciousness(int spaciousness) {
        this.spaciousness = spaciousness;
    }

    public int getBuilding() {

        return building;
    }


    public void setBuilding(int building) {
        this.building = building;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public Classroom() {
    }

    public int getClassroom() {

        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
}