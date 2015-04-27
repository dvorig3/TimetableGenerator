package com.luckers.timetable.dao;

import com.luckers.timetable.entities.Group;
import com.luckers.timetable.entities.Lecturer;
import com.luckers.timetable.entities.Subject;

/**
 * Created by ihor on 27.04.2015.
 */
public interface DAO {

    public void insertGroup(Group group);
    public void updateGroup(Group group);
    public Group selectGroupById(int groupId);

    public void insertLecturer(Lecturer lecturer);
    public void updateLecturer(Lecturer lecturer);
    public Lecturer selectLecturerById(int lecturerId);

    public void insertSubject(Subject subject);
    public void updateSubject(Subject subject);
    public Subject selectSubjectById(int subjectId);
}
