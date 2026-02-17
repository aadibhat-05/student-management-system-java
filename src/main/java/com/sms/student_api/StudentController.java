package com.sms.student_api;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
    @DeleteMapping("/{id}")
public String deleteStudent(@PathVariable int id) {
    boolean removed = service.deleteStudent(id);

    if (removed) {
        return "Student deleted";
    } else {
        return "Student not found";
    }
}
@PutMapping("/{id}")
public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
    return service.updateStudent(id, updatedStudent);
}
}
