package com.luckers.timetable.entities;

import com.luckers.timetable.staticinfo.StaticInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ihor on 27.04.2015.
 */
@Entity
public class Lecturer {
    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param degree
     */
    public Lecturer(
            @Min(value = StaticInfo.LECTOR_ID_MIN_VALUE) int id,
            @Size(min = StaticInfo.LECTOR_FIRST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_FIRST_NAME_MAX_VALUE) String firstName,
            @Size(min = StaticInfo.LECTOR_LAST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_LAST_NAME_MAX_VALUE) String lastName,
            String degree) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(@Min(value = StaticInfo.LECTOR_ID_MIN_VALUE) int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(
            @Size(min = StaticInfo.LECTOR_FIRST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_FIRST_NAME_MAX_VALUE) String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(
            @Size(min = StaticInfo.LECTOR_LAST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_LAST_NAME_MAX_VALUE) String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree
     *            the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Lector [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", degree=" + degree + "]";
    }

    @Min(value = StaticInfo.LECTOR_ID_MIN_VALUE)
    private int id;

    @Size(min = StaticInfo.LECTOR_FIRST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_FIRST_NAME_MAX_VALUE)
    private String firstName;

    @Size(min = StaticInfo.LECTOR_LAST_NAME_MIN_VALUE, max = StaticInfo.LECTOR_LAST_NAME_MAX_VALUE)
    private String lastName;

    @Size(min = StaticInfo.LECTOR_LAST_DEGREE_VALUE, max = StaticInfo.LECTOR_DEGREE_MAX_VALUE)
    private String degree;
}
