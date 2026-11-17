# PutUpdateDemo - Spring Boot PUT Update API

## Requirements
- Java 17+
- MySQL 8+
- Spring Tools Suite 4 (or any IDE with Maven)

## Setup
1. Edit MySQL username/password in `src/main/resources/application.properties`.
   (The `studentdb` database is created automatically.)
2. Import: File > Import > Existing Maven Projects.
3. Run `PutUpdateDemoApplication.java` as Spring Boot App (the `student` table is auto-created).
4. Insert a sample row using `database.sql`.

## Test (Postman)
PUT http://localhost:8080/students/1
Body > raw > JSON:
{ "name": "Raja", "department": "IT", "age": 22 }

Expected: 200 OK with the updated student JSON.
Unknown id: 404 Not Found.
