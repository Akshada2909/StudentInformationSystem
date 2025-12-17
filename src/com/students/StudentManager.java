package com.students;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student added successfully!");
    }

    // View
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n=== ALL STUDENTS ===");
        System.out.printf(
            "%-15s %-20s %-8s %-8s %-20s%n",
            "Student ID", "Name", "Age", "Grade", "Contact"
        );
        System.out.println("----------------------------------------------------------------------");

        for (Student s : students) {
            System.out.printf(
                "%-15s %-20s %-8d %-8.2f %-20s%n",
                s.getStudentId(),
                s.getName(),
                s.getAge(),
                s.getGrade(),
                s.getContact()
            );
        }
    }

    // Search
    public Student searchStudent(String input) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(input) ||
                s.getName().equalsIgnoreCase(input)) {
                return s;
            }
        }
        return null;
    }

    // Update
    public boolean updateStudent(String id, String name, int age, double grade, String contact) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                s.setName(name);
                s.setAge(age);
                s.setGrade(grade);
                s.setContact(contact);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deleteStudent(String id) {
        return students.removeIf(s -> s.getStudentId().equalsIgnoreCase(id));
    }
}
