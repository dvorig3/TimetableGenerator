package com.luckers.timetable.dao;

import com.luckers.timetable.entities.Group;
import com.luckers.timetable.entities.Lecturer;
import com.luckers.timetable.entities.Subject;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
