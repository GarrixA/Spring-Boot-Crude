package com.example.demo.students;

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
            Student garrix = new Student(
                    "Garrix",
                    "garrix@gmail.com",
                    LocalDate.of(2002, Month.AUGUST, 12)
            );
            Student Olivis = new Student(
                    "Olivis",
                    "olivis@gmail.com",
                    LocalDate.of(2002, Month.AUGUST, 12)
            );
            Student Yvette = new Student(
                    "yvette",
                    "yvette@gmail.com",
                    LocalDate.of(2004, Month.AUGUST, 9)
            );
            Student Thymo = new Student(
                    "Thymo",
                    "thymo@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 6)
            );

            repository.saveAll(
                    List.of(garrix, Olivis, Yvette, Thymo)
            );
        };
    }
}
