package com.bnta.enrollments.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "room")
    private List<Room> rooms;










}
