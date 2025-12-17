package com.students;

import java.util.Scanner;

public class ValidationUtils {

    public static int validateAge(Scanner sc) {
        int age;
        do {
            System.out.print("Enter Age (positive number): ");
            age = sc.nextInt();
            if (age <= 0) {
                System.out.println("❌ Age must be a positive number.");
            }
        } while (age <= 0);
        return age;
    }

    public static double validateGrade(Scanner sc) {
        double grade;
        do {
            System.out.print("Enter Grade (0 - 100): ");
            grade = sc.nextDouble();
            if (grade < 0 || grade > 100) {
                System.out.println("❌ Grade must be between 0 and 100.");
            }
        } while (grade < 0 || grade > 100);
        return grade;
    }
}
