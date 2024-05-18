package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ET = new Student(
                    "Etornam Normanyo-Grives",
                    LocalDate.of(2004, Month.MAY, 5),
                    "grives@gmail.com"
            );
            Student Lex = new Student(
                    "Zormelo Alex",
                    LocalDate.of(2000, Month.JULY, 9),
                    "dom@gmail.com"
            );

            //save to database
            repository.saveAll(
                    List.of(ET, Lex)
            );
        };
    }
}
