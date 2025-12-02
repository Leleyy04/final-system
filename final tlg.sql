
CREATE DATABASE IF NOT EXISTS StudentnDB;


USE StudentnDB;


CREATE TABLE IF NOT EXISTS Students (
id INT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
age INT NOT NULL,
course VARCHAR(50) NOT NULL,
year INT NOT NULL
);


INSERT INTO Students (id, name, age, course, year) VALUES
(1, 'Chukoy', 18, 'BSIT', 1),
(2, 'Butete', 19, 'BSCS', 2),
(3, 'Porman', 20, 'BSIT', 3),
(4, 'Bantaytay', 21, 'BSIT', 4),
(5, 'Shukshuk', 18, 'BSCS', 1);


CREATE TABLE IF NOT EXISTS users (
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50) UNIQUE NOT NULL,
password VARCHAR(50) NOT NULL
);

 
INSERT INTO users (username, password) VALUES
('admin', 'admin123');
