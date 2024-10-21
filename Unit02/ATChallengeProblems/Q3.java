package Unit02.ATChallengeProblems;

// Alex Benson
// At Challange Problems
// Question 3
// 10/21/24

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt user for number
        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();
        
        

        // verifies that it is a positive integer
        if (num <= 0) {
            System.err.println("This is not a positive integer, please try again.");
            System.exit(0);
        } 

            if (num < 2){
                //if the number is less than two (1) it is not prime
                System.out.println("This is not a prime number."); 
                System.exit(0);
            } else if (num == 2) {
                //if the number is two it is prime
                System.out.println("This is a prime number!"); 
                System.exit(0);
            }
            else if ((num % 2) == 0) {
                //if the number is even it is prime
                System.out.println("This is not a prime number."); 
                System.exit(0);
            } 
            
            else {
             
                int divisor = 3;

                while (divisor < num) {
                    /* here we divide by an odd number starting with 3 
                    if there is a remainder (meaning it does not evenly divide) we add two to the divisor (making it the next odd number)
                    and the loop continues
                    if the divisor equals the number and then the loop ends */
                    int remainder = num % divisor;
                    if (remainder == 0){
                        //if it can be evenly divided it is not prime
                        System.out.println("This is not a prime number.");
                        System.exit(0);
                    }
                    divisor = divisor + 2;
                }
                //displays conclusion to user if the loop successfully ends without being interupted 
                System.out.println("This is a prime number!");
                    
                }      
        }

    }


