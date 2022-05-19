package com.bnta.enrollments.repositories;

import com.bnta.enrollments.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
