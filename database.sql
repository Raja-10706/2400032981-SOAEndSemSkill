CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

-- Run AFTER the app has started once (Hibernate creates the `student` table)
INSERT INTO student (name, department, age)
VALUES ('Ravi', 'CSE', 20);
