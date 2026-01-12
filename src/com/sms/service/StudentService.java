package com.sms.service;

import java.util.Iterator;
import com.sms.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        if (idExists(student.getId())) {
        System.out.println("Student with this ID already exists!");
        return;
    }
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Update student
    public void updateStudent(int id, String name, int age, String course) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete student
    public void deleteStudent(int id) {

    Iterator<Student> iterator = students.iterator();

    while (iterator.hasNext()) {
        Student s = iterator.next();
        if (s.getId() == id) {
            iterator.remove();
            System.out.println("Student deleted successfully!");
            return;
        }
    }

    System.out.println("Student not found!");
}

    private boolean idExists(int id) {
    for (Student s : students) {
        if (s.getId() == id) {
            return true;
        }
    }
    return false;
}
}
