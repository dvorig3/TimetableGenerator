package com.luckers.timetable.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by ihor on 27.04.2015.
 */
@Entity
public class Timetable {

    @Id @GeneratedValue
    private Integer id;

    @NotNull @ManyToOne @JoinColumn(name="group_id")
    private Group group;

    @NotNull @Column(name="lesson_number")
    @Pattern(regexp = "/[1-6]/")
    private int lessonNumber;

    @NotNull @ManyToOne @JoinColumn(name="classroom_id")
    private Classroom classroom;

    @NotNull @ManyToOne @JoinColumn(name="week_id")
    private Week week;

    @NotNull @Enumerated(EnumType.STRING)
    private Day day;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
