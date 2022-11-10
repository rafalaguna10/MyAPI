package com.myapi.MyAPI.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Isaac",
                        "isaac3@example.com",
                        LocalDate.of(1999, 02, 20),
                        23
                )
        );
    }
}
