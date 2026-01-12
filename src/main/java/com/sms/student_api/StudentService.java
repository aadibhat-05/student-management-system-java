package com.sms.student_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents(){
        return students;
    }
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }
}
