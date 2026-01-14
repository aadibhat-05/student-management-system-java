# Student Management System Spring Boot REST API

This is a simple Student Management System backend built using Spring Boot.
The project provides a REST API to add, view, update, and delete student records.

This project was created as part of learning backend development with Java and Spring Boot.

## Features

- Add a new student
- View all students
- Update an existing student
- Delete a student
- Uses JSON for data exchange
- Follows Controller, Service, and Model structure

## Technologies Used

- Java 17
- Spring Boot
- Maven
- REST API
- JSON

## API Endpoints

GET /students  
Returns all students  

POST /students  
Adds a new student  

PUT /students/{id}  
Updates a student  

DELETE /students/{id}  
Deletes a student  

## Sample JSON for Adding a Student

```json
{
  "id": 1,
  "name": "Aadi",
  "age": 19,
  "course": "CSE"
}

How to Run the Project:

1. Clone the repository

2. Open the project folder in VS Code or any IDE

3. Run the following command:
   
   mvn spring-boot:run
4. Server will start at:
   
   http://localhost:8080
   
Purpose of This Project:

This project was built to understand how backend systems work, how REST APIs are implemented, and how data flows between client and server. The focus is on backend logic rather than user interface.

