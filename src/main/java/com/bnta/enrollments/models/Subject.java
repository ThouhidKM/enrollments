package com.bnta.enrollments.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="subjects")
public class Subject {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="Subject Name")
    private String subject_name;

    @Column(name="Subject Code")
    private String subject_code;

    @Column(name="Credits")
    private Long credits;

    @ManyToMany(mappedBy= "subjects")
    private List<Room> rooms;

    protected Subject(){}
    public Subject(String subject_name, String subject_code, Long credits) {
        this.subject_name = subject_name;
        this.subject_code = subject_code;
        this.credits = credits;
        this.rooms = new ArrayList<Room>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public Long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        this.credits = credits;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }
    public boolean removeRoom(Room room){
        return this.rooms.remove(room);
    }
}
