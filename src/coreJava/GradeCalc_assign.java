package coreJava;

import java.util.Scanner;

public class GradeCalc_assign {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = input.nextInt();
        input.close();

        displayGrade(marks);
    }

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Your grade is AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Your grade is AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Your grade is BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Your grade is BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Your grade is CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Your grade is DD");
        } else if (marks == 40) {
            System.out.println("You have barely passed with minimum passing marks");
        } else if (marks < 40) {
            System.out.println("Sorry, you have failed the exam");
        } else {
            System.out.println("Invalid marks entered");
        }
    }
}
