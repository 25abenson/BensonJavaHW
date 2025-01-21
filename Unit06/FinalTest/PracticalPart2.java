//Alex Benson
// Unit 5/6 Test
// Practical Problem 2

import java.util.ArrayList;
import java.util.Scanner;

public class PracticalPart2 {
    public static void main(String[] args) {

        // create insatnce of scanner
        Scanner in = new Scanner(System.in);
        // create array list to hold double values
        ArrayList<Double> quizScores = new ArrayList<Double>();

        // loop to continue adding to array list
        while (true) {
            System.out.print("Enter a quiz score or q to quit: ");
            // if user types "q" loop will quit
            if (in.hasNext("Q") || in.hasNext("q")) {
                System.out.println("You have quit the program. Here are your scores: ");
                break;
            } else { // if q is not entered the program adds the double value to the array list
                quizScores.add(in.nextDouble());
            }
        }

        // calculates total of all quiz scores
        double total = 0;
        // keeps track of number of quizzes
        double numScores = 0;

        System.out.println("-------------------");

        // loops through array and prints each score on a new line formatted with two
        // decimal places
        for (int i = 0; i < quizScores.size(); i++) {
            System.out.printf("%8.2f%n", quizScores.get(i));
            // adds score to total
            total = total + quizScores.get(i);
            // adds one for each score to number of quizzes
            numScores++;
        }

        System.out.println("-------------------");
        // calculates average
        double average = total / numScores;
        // displays average to user
        System.out.printf("average = %5.2f%n", average);

    }
}
