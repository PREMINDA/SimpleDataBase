package com.example.SimpleDataBase.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student marium = new Student(
                    "Mariam",
                    "marium@gmail.com",
                    LocalDate.of(2000, FEBRUARY,5)

            );
            Student nilson = new Student(
                    "Nilson",
                    "nilson@gmail.com",
                    LocalDate.of(2001, MARCH,12)
            );

            repository.saveAll(
                    List.of(marium,nilson)
            );


        };
    }
}
