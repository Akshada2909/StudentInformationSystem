# 📘 Student Information System – Project Documentation

---

## 1. Project Overview
The Student Information System is a console-based Java application designed to manage student records efficiently.  
The system allows users to store and manage student details such as Student ID, Name, Age, Grade, and Contact Information through a simple menu-driven interface.

This project is developed as part of an academic/internship requirement to demonstrate understanding of Java programming fundamentals and Object-Oriented Programming concepts.

---

## 2. Project Objectives
- To understand and apply core Java programming concepts
- To implement Object-Oriented Programming (OOP) principles
- To perform CRUD (Create, Read, Update, Delete) operations
- To use ArrayList for dynamic data storage
- To implement basic input validation and error handling
- To build a structured, menu-driven console application

---

## 3. Technologies Used
- Java (JDK 8 or above)
- Spring Tool Suite (STS)
- GitHub
- GitHub Desktop
- Scanner Class (for user input)

---

## 4. System Requirements

### Hardware Requirements
- Minimum 4 GB RAM
- Any standard desktop or laptop

### Software Requirements
- Windows Operating System
- Java JDK 8 or above
- Spring Tool Suite (STS)
- GitHub / GitHub Desktop

---

## 5. Setup and Project Installation Instructions
1. Install Java JDK (8 or above) on your system
2. Install Spring Tool Suite (STS)
3. Clone or download the project from GitHub
4. Open STS and go to **File → Import → Existing Projects into Workspace**
5. Select the project folder and click **Finish**
6. Navigate to:
7. Right-click → **Run As → Java Application**
8. Follow the instructions displayed in the console

---

## 6. Project Structure

Student-Information-System/
│
├── README.md
├── src/
│ ├── Student.java
│ ├── StudentManager.java
│ ├── ValidationUtils.java
│ └── StudentInformationSystem.java
│
├── docs/
│ └── Documentation.md
│
└── test_data/
└── sample_students.txt
---

## 7. Code Structure Explanation

### Student.java
Defines the Student class with attributes such as studentId, name, age, grade, and contact along with getter and setter methods.

### StudentManager.java
Contains the business logic for adding, viewing, updating, deleting, and searching student records using an ArrayList.

### ValidationUtils.java
Provides validation methods to ensure age is a positive number and grade is within a valid range.

### StudentInformationSystem.java
Acts as the main class that provides a menu-driven user interface using the Scanner class.

---

## 8. User Manual

### Menu Options
- Add New Student
- View All Students
- Search Student
- Update Student
- Delete Student
- Exit

### How to Use
- Enter the menu number to select an option
- Provide required inputs when prompted
- The system displays success or error messages based on input

---

## 9. Data Validation
- **Age Validation:** Age must be a positive number
- **Grade Validation:** Grade must be within a valid range
- Invalid inputs are handled gracefully with error messages

---

## 10. Technical Details

### Object-Oriented Programming (OOP) Concepts Used
- **Encapsulation:** Student data fields are private and accessed using getters and setters
- **Abstraction:** Student management logic is handled inside the StudentManager class
- **Modularity:** Separate classes are used for model, validation, and logic
- **Reusability:** Validation methods are reused throughout the application
- **ArrayList:** Used for dynamic storage and CRUD operations

---

## 11. Explanation of How Technical Requirements Are Met
- Student class created with required attributes
- Menu-driven interface implemented using Scanner
- CRUD operations implemented using ArrayList
- Search functionality by Student ID and Name
- Input validation implemented for age and grade
- Properly formatted console output
- Basic error handling for invalid inputs

---

## 12. Testing Evidence

| Test Case        | Input        | Expected Output              |
|------------------|--------------|------------------------------|
| Add Student      | Valid details| Student added successfully  |
| Age Validation   | -10          | Error message displayed     |
| Grade Validation | 150          | Invalid grade message       |
| Search Student   | Valid ID     | Student details displayed   |
| Delete Student   | Invalid ID   | Student not found message   |

---



## 13. Conclusion
The Student Information System successfully meets all project and documentation requirements.  
It demonstrates effective use of Java programming fundamentals, Object-Oriented Programming concepts, data structures, and validation techniques suitable for academic and internship submissions.

---

## 14. Author
**Akshada Shelke**  
T.Y BSc (Computer Science) Student
