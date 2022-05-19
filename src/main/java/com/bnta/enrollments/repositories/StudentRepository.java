package com.bnta.enrollments.repositories;

import com.bnta.enrollments.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
