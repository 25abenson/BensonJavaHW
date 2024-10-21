package Unit04.Lesson08;

// Alex Benson
// Lesson 8 HW Part B
// 10/18/24

import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        
        //scanner set up
        Scanner in = new Scanner(System.in);
       
       //get input from user and set varibles as the input using scanner function
        System.out.print("Enter APR (as a percentage for example 5.5): ");
        double apr = in.nextDouble();
        System.out.print("Enter the balance: ");
        double initialbalance = in.nextDouble();
        int year = 1;
        
        //begin the table formatting
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(" Year                |                interest earned                |                balance ($)      |");
        System.out.println("-------------------------------------------------------------------------------------------------------");

       
       //loop enabling the caculations of the interest from year one to five
        for (year = 1; year < 6; year++){
            double interest = (initialbalance * apr * .01);
            double balance = interest + initialbalance;

            //this prints the info in the correct format to the user
            System.out.format("%21d", year);
            System.out.printf("|%47.2f", interest);
            initialbalance = balance;
            System.out.format("|%,33.2f|%n", balance);
           

        }




    }
    
}
