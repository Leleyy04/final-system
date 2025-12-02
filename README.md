 🎓 Student DetailsManagement System (Java + MySQL)

 🎓 Student DetailsManagement System (Java + MySQL)
A simple and lightweight  built using Java Swing and MySQL.
The application allows users to "Add, Update, Delete, and View" student records through an intuitive graphical interface.


 🚀 Features

 🔐 Login Authentication
 🏠 Main Dashboard UI
 ➕ Add New Student
 ✏️ Update Existing Student
 ❌ Delete Student
 📋 View All Students (JTable)
 🗄 Database Connectivity using JDBC
 📂 Clean and easy-to-read code structure


🗂️ Project Structure


src/
 └── studentdetailsmanagement/
      ├── DBConnection.java       Handles MySQL connection
      ├── Loginto.java           User login form
      ├── Mainfinal.java           - Dashboard after login
      ├── Student.java      
      ├── StudentDAOCombined.java  
      ├── User.java
      └── UserDAOCombined.java




🛢 Database Setup

Database Name: `StudentnDB`
Main Table: `Mainfinal`

SQL Structure


CREATE TABLE IF NOT EXISTS Students (
id INT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
age INT NOT NULL,
course VARCHAR(50) NOT NULL,
year INT NOT NULL
);



 Database Connection

The project uses DBConnection.java:


 String url = "jdbc:mysql://localhost:3306/StudentnDB?useSSL=false&serverTimezone=UTC";
 String user = "root";          // MySQL username
 String password = "100405";    //  MySQL password
> ⚠ Make sure to update your MySQL password accordingly.



🧰 Technologies Used

Java (JDK 8–21)
Java Swing (GUI)
MySQL
JDBC (mysql-connector-j.jar)**


 ▶️ How to Run the Project

 1. Install Requirements

Java JDK
MySQL Server/MYSQL WORKBENCH
NetBeans 

 2. Import Database

 Open MYSQL WORKBENCH
 Create database: `StudentnDB`
 Import your SQL file OR run the table script above.

3. Add JDBC Library

Download: `mysql-connector-j-8.x.x.jar`
Add to project libraries.

 4. Run the Application

 Open the project in your IDE
  Run `Loginto.java`
 Login → Access dashboard → Manage students



 🎯 Purpose of This Project

This system demonstrates:

 GUI programming using Java Swing
CRUD operations with MySQL
Database-driven applications
Clean MVC-like structuring
 Beginner-friendly system design


 👨‍💻 Author


📍 Philippines
💻 IT Students / Tabilin Lynnard, Pineda Andrei, Sanalila Luis Ivan

Feel free to improve, fork, or modify our project!


