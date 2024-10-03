package Chapter3difelseif;

import java.util.Scanner;

public class Grade {
    public static void main(String args[]) {

            System.out.println("Enter your score:");
            Scanner input = new Scanner(System.in);
            double score = input.nextDouble();

            //determine the grade
            char grade;

            if (score < 50) {
                grade = 'F';
            } else if (score < 60) {
                grade = 'E';
            } else if (score < 70) {
                grade = 'D';
            } else if (score < 80) {
                grade = 'C';
            } else if (score < 90) {
                grade = 'B';
            } else {
                grade = 'A';
            }
            System.out.println("Your grade is:" + grade);
        }
    }