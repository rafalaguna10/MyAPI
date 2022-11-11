package com.myapi.MyAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Isaac = new Student(
                    "Isaac",
                    "isaac3@example.com",
                    LocalDate.of(1999, 02, 20)
            );

            Student Anna = new Student(
                    "Anna",
                    "Anna@example.com",
                    LocalDate.of(2000, 04, 02)
            );

            repository.saveAll(
                    List.of(Isaac, Anna)
            );
        };
    }

}
