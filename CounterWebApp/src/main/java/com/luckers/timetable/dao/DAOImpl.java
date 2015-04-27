package com.luckers.timetable.dao;

import com.luckers.timetable.entities.*;
import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Date;

/**
 * Created by ihor on 27.04.2015.
 */
@Repository
public class DAOImpl implements DAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertGroup(Group group) {

    }

    @Override
    public void updateGroup(Group group) {

    }

    @Override
    public Group selectGroupById(int groupId) {
        return null;
    }

    @Override
    public void insertLecturer(Lecturer lecturer) {

    }

    @Override
    public void updateLecturer(Lecturer lecturer) {

    }

    @Override
    public Lecturer selectLecturerById(int lecturerId) {
        return null;
    }

    @Override
    public void insertSubject(Subject subject) {

    }

    @Override
    public void updateSubject(Subject subject) {

    }

    @Override
    public Subject selectSubjectById(int subjectId) {
        return null;
    }

    @Override
    public void insertWeek(Week week) {
        entityManager.persist(week);
    }

    @Override
    public Week selectWeekById(int id) {
        Week week = entityManager.find(Week.class, id);
        return week;
    }

    @Override
    public void addClassroom(Classroom classroom) {
        entityManager.persist(classroom);
    }

    @Override
    public void updateClassroom(Classroom classroom) {
        entityManager.refresh(classroom);
    }

    @Override
    public Classroom selectClassroomById(int id) {
        return entityManager.find(Classroom.class, id);
    }
}
