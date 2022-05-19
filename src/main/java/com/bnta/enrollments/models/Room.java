package com.bnta.enrollments.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "room")
    private List<Student> students;

    @ManyToMany()
    @JoinTable(
            name="enrollments",
            joinColumns = {@JoinColumn(name="room_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="subject_id",nullable = false)}
    )
    private List<Subject> subjects;

    protected Room(){}
    public Room(List<Student> students, List<Subject> subjects) {
        this.students = students;
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
