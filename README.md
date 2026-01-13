Student Management System – Spring Boot REST API

This is a simple Student Management System backend built using Spring Boot.
The project provides a REST API that allows adding, viewing, updating, and deleting student records. It is designed to demonstrate how a basic backend application is structured using controllers, services, and REST endpoints.

This project was built as part of learning backend development with Java and Spring Boot.

Features:

Add a new student

View all students

Update an existing student

Delete a student

Data is exchanged using JSON over HTTP

Follows a clean layered structure (Controller, Service, Model)

Technologies Used:

Java 17

Spring Boot

Maven

REST API

JSON

API Endpoints:

Method	   Endpoint	        Description
GET	       /students        Get all students
POST	   /students        Add a new student
PUT	       /students/{id}	Update a student
DELETE	   /students/{id}	Delete a student

Sample JSON for Adding a Student:

{
  "id": 1,
  "name": "Aadi",
  "age": 19,
  "course": "CSE"
}

How to Run the Project

1. Clone the repository

2. Open the project folder in VS Code or any IDE

3. Run the following command in the project directory:
mvn spring-boot:run

4. The server will start at:
http://localhost:8080

Purpose of This Project:

This project was created to understand how backend systems work, how REST APIs are built, and how data flows between the client and the server. It focuses on core backend concepts rather than UI.
