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
            joinColumns = {@JoinColumn(name="room_id")},
            inverseJoinColumns = {@JoinColumn(name="subject_id")}
    )
    private List<Subject> subjects;






    protected Room(){}
    public Room(List<Student> students) {
        this.students = new ArrayList<>();
    }







}
