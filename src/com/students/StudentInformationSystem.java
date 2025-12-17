package com.students;

import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n=== STUDENT INFORMATION SYSTEM ===");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1 -> {
                    System.out.println("\n=== ADD NEW STUDENT ===");

                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    int age = ValidationUtils.validateAge(sc);
                    double grade = ValidationUtils.validateGrade(sc);
                    sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    manager.addStudent(
                        new Student(id, name, age, grade, contact)
                    );
                }

                case 2 -> manager.viewAllStudents();

                case 3 -> {
                    System.out.println("\n=== SEARCH STUDENT ===");
                    System.out.print("Enter Student ID or Name: ");
                    String input = sc.nextLine();

                    Student s = manager.searchStudent(input);
                    if (s != null) {
                        System.out.println("\nFound Student:");
                        System.out.println("Student ID: " + s.getStudentId());
                        System.out.println("Name: " + s.getName());
                        System.out.println("Age: " + s.getAge());
                        System.out.println("Grade: " + s.getGrade());
                        System.out.println("Contact: " + s.getContact());
                    } else {
                        System.out.println("❌ Student not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Student ID to update: ");
                    String id = sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    int age = ValidationUtils.validateAge(sc);
                    double grade = ValidationUtils.validateGrade(sc);
                    sc.nextLine();

                    System.out.print("Enter New Contact: ");
                    String contact = sc.nextLine();

                    System.out.println(
                        manager.updateStudent(id, name, age, grade, contact)
                        ? "✅ Student updated successfully!"
                        : "❌ Student not found."
                    );
                }

                case 5 -> {
                    System.out.print("Enter Student ID to delete: ");
                    String id = sc.nextLine();

                    System.out.println(
                        manager.deleteStudent(id)
                        ? "🗑️ Student deleted successfully!"
                        : "❌ Student not found."
                    );
                }

                case 6 -> System.out.println("Exiting system...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
