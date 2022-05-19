package com.bnta.enrollments.repositories;

import com.bnta.enrollments.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
