package Unit04.Lesson08;

// Alex Benson
// Lesson 8 HW Part B
// 10/18/24

import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter APR (as a percentage for example 5.5): ");
        double apr = in.nextDouble();
        System.out.print("Enter the balance: ");
        double initialbalance = in.nextDouble();
        int year = 0;
        System.out.printf("-------------------------------------------------------------------------------------------------------%n");
        System.out.printf(" Year                |                initial balance                |                balance ($)      %n");
        System.out.printf("-------------------------------------------------------------------------------------------------------%n");

        for (year = 0; year < 6; year++){
            initialbalance = (initialbalance * apr) + initialbalance;
            System.out.printf(" %1f", year);
            System.out.printf("                | %5.2f");
            System.out.printf("           | %10.2f%n");
        }




    }
    
}
