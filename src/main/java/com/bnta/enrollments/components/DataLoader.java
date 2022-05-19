package com.bnta.enrollments.components;

import com.bnta.enrollments.models.Subject;
import com.bnta.enrollments.repositories.RoomRepository;
import com.bnta.enrollments.repositories.StudentRepository;
import com.bnta.enrollments.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Subject subject1 = new Subject("Introduction to Probabilities and Statistics", "INPS01", 30L);
    }
}