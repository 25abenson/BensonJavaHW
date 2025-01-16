// Alex Benson
// Part A Lesson 23 HW
// 1/16/25

import java.util.Scanner;

public class PartA {

    // create method to throw my own exception
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score: ");
        int score = in.nextInt();

        // if the score is not within the range it throws an Artihmetic Exception
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Score must be between 1 and 100.");
        } else { // else return the score
            return score;
        }
    }

    public static void main(String[] args) {

        // create instance of scanner
        Scanner in = new Scanner(System.in);

        // use created method
        while (true) {
            int newScore;
            try {
                getQuizScore(in);
            } catch (Exception e) {
                // exception message
                System.err.println(e.getMessage());
                // tell user to try again
                System.err.println("Not a valid input. Try again.");

            }
        }

    }
}
