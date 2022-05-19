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


    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
