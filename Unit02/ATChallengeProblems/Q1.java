package Unit02.ATChallengeProblems;

// Alex Benson
// AT Challenge Problems 
// Question 1 
// 10/21/24

import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get info from user
        System.out.print("Enter a price (ex. $10.55): $");
       
       //assign user input to variables and split variables at the .
        String price = in.nextLine();
       String dollars = price.split("\\.")[0];
       String cents = price.split("\\.")[1];
       
        //display info to user
        System.out.println("You have " + dollars + " dollars and " + cents + " cents!");
      


    }
}