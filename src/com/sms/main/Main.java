package com.sms.main;

import com.sms.model.Student;
import com.sms.service.StudentService;

import java.util.Scanner;

public class Main {
    private static int readInt(Scanner sc, String message) {
    System.out.print(message);
    while (!sc.hasNextInt()) {
        System.out.println("Please enter a valid number!");
        sc.next();
        System.out.print(message);
    }
    int value = sc.nextInt();
    sc.nextLine(); // clear buffer
    return value;
}


    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = readInt(sc, "Enter choice: ");
            switch (choice) {

                case 1:
                    int id = readInt(sc, "Enter ID: ");// consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    int age = readInt(sc, "Enter age: ");


                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    service.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    int uid = readInt(sc, "Enter ID to update: ");

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    int newAge = readInt(sc, "Enter new Age: ");

                    System.out.print("Enter new Course: ");
                    String newCourse = sc.nextLine();

                    service.updateStudent(uid, newName, newAge, newCourse);
                    break;
                case 4:
                    int did = readInt(sc, "Enter ID to delete: ");
                    service.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
