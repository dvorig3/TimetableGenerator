package com.luckers.timetable.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ihor on 27.04.2015.
 */
@Entity
public class Lecturer {
    @Id @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String s_name;
    @NotNull
    private String l_name;
}
