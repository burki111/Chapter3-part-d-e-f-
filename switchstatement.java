package Chapter3;

import java.util.Scanner;

public class switchstatement {
    public static void main(String args[]) {

        System.out.println("Enter your grade:");
        Scanner input = new Scanner(System.in);
        String grade = input.next();
        String message;
        switch(grade) {
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Very Good!";
                break;
            case "C":
                message = "Good!";
                break;
            case "D":
                message = "Fair!";
                break;
            case "F":
                message = "Fail!";
                break;
            default:
                message = "invalid";
                break;
        }
        System.out.println(message);
}
}
