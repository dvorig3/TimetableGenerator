package com.luckers.timetable.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by ihor on 27.04.2015.
 */
@Entity
public class Timetable {

    @NotNull @ManyToOne @JoinColumn(name="group_id")
    private Group group;

    @NotNull @Column(name="lesson_number")
    @Pattern(regexp = "/[1-6]/")
    private int lessonNumber;
}
