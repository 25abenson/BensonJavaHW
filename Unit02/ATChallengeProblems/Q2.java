package Unit02.ATChallengeProblems;

// Alex Benson
// At Challenge Problems
// Question 2
// 10/21/24

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //display info from the user
        System.out.print("Enter you ten-digit telephone number (no spaces): ");

        //assign variable to be stored
        String number = in.nextLine();

        //divide into substring to put number into format of (###) ###-####
        String parenthesis = number.substring(0,3);
        String beforedash = number.substring(3,6);
        String afterdash = number.substring(6);

        //display info to user
        System.out.println("The formatted number is (" + parenthesis + ")" + " " + beforedash + "-" + afterdash);

        

    }
}
