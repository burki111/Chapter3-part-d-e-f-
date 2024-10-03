package Chapter3f;

import java.util.Scanner;

public class WinaDollar {

    public static void main(String args[]) {

        double penny = .25;
        double nickle = .25;
        double quarter = .1;
        double dime = .4;
        int dollar = 1;

        System.out.println("How many quantity of penny:");
        Scanner input = new Scanner(System.in);
        int quantityofpenny = input.nextInt();

        System.out.println("How many quantity of nickle:");
        int quantityofnickle = input.nextInt();
        System.out.println("How many quantity of of dime:");
        int quantityofdime = input.nextInt();
        System.out.println("How many quantity quarter:");
        int quantityofquarter = input.nextInt();

        double answer = quantityofpenny * penny + quantityofnickle * nickle + quantityofdime * dime + quantityofquarter * quarter;

        if (answer < dollar){
            double amountlessthan = dollar - answer;

            System.out.println("Sorry you lose! You were just short of:" +amountlessthan+ "cents from:$" +dollar);
        }
        else if(answer > dollar){
            double amountmorethan =answer - dollar;
            System.out.println("Sorry you lose! Your amount exceeded an extra of "+amountmorethan+ "cents from$" +dollar);
        }
        else{
            System.out.println("You Win! Your amount is exactly 1.00 dollar");
        }
        }
    }

