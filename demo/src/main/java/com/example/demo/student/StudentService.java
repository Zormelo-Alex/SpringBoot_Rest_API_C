package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
        @GetMapping
        public List<Student> getStudents() {
            return List.of(
                    new Student(1L, "Etornam Normanyo-Grives", 20, LocalDate.of(2002, Month.MAY, 5), "grives@gmail.com")
            );
        }
}
