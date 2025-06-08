# 📚 Student Management System - Spring Boot + MongoDB

This project is a simple **Student Management System** built using **Spring Boot** and **MongoDB**. It provides RESTful APIs to **create**, **read**, **update**, and **delete** (CRUD) student records.

---

## 🚀 Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: MongoDB (NoSQL)
- **Java Version**: 17+ (or compatible version used)
- **Build Tool**: Maven / Gradle
- **Validation**: Jakarta Bean Validation (JSR 380)
- **REST API**: Spring Web MVC

---


---

## 📄 API Endpoints

| HTTP Method | Endpoint         | Description                |
|-------------|------------------|----------------------------|
| POST        | `/students`      | Create a new student       |
| GET         | `/students`      | Retrieve all students      |
| GET         | `/students/{id}` | Retrieve student by ID     |
| PUT         | `/students/{id}` | Update student by ID       |
| DELETE      | `/students/{id}` | Delete student by ID       |

---

## 🧾 Sample Student JSON

```json
{
  "name": "Rahul Kumar",
  "email": "rahul@example.com",
  "course": "Computer Science",
  "rollNumber": "CSE2023001"
}
