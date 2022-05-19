package com.bnta.enrollments.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate dob;

    @Transient
    private Integer age;


    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;


    protected Student(){}
    public Student(String name, LocalDate dob, Room room) {
        this.name = name;
        this.dob = dob;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
