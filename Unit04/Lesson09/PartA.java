// Alex Benson
// Lesson09 HW Part A
// 10/25/24

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        //sets up scanner
        Scanner in = new Scanner(System.in);
        //assigns variables
        double currentScore = 0;
        double total = 0;
        int numScores = 0;

        //this loop will allow user to enter test scores until they enter a negative number
        do {
            System.out.print("Enter your test score: ");
            currentScore = in.nextDouble();
            total = total + currentScore;
            numScores++;
        } while (currentScore >= 0);

        //all the test scores are averaged
        double average = total / numScores;
        //output displayed to user
        System.out.println("The number of scores entered is: " + numScores);
        System.out.println("The average test score is: " + average);


    }
}
