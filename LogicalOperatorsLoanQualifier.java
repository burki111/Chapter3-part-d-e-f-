package Chapter3f;

import java.util.Scanner;

public class LogicalOperatorsLoanQualifier {

    public static void main(String args[]) {

        int amount_salary = 30000;
        int years_experience = 2;
        System.out.println("Enter your salary:");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        System.out.println("Enter your required experience years:");
        double experience = input.nextDouble();

        if (salary >= amount_salary && experience >= years_experience) {

            System.out.println("Congrats! You are qualified for the loan");

        } else {
            System.out.println("Sorry you aren't qualified for the loan");
        }
    }
}
