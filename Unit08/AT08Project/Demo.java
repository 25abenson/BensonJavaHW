import java.util.Scanner;

import Mow.*;

public class Demo {

    // clear screen method
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // pause method
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {

        clearScreen();
        Scanner in = new Scanner(System.in);

        // ask user for dimensions
        System.out.print("Enter length of yard as integer: ");
        int length = in.nextInt();
        System.out.print("Enter width of yard as integer: ");
        int width = in.nextInt();

        clearScreen();

        // create instance of yard
        Yard myYard = new Yard(length, width);

        // create instance of mower
        Mower myMower = new Mower();

        // set mower and initialize it to top corner
        myMower.randomize(myYard);

        // print the lawn
        myYard.printLawn(myMower);

        // check if needs to turn
        while (myMower.checkSquare(myYard) == true) {
            myMower.turnRight();
            clearScreen();
            myYard.printLawn(myMower);
        }

        // loop for cutting the grass
        for (int i = 0; i < myYard.getHeight() * myYard.getWidth(); i++) {

            // mow space and move forward
            myMower.mowSpace(myYard);
            myMower.moveMower();
            delay(500);
            clearScreen();
            myYard.printLawn(myMower);

            int numturns = 0;

            // check if needs to turn
            while (myMower.checkSquare(myYard) == true) {
                // turn and clear screen
                myMower.turnRight();
                clearScreen();
                myYard.printLawn(myMower);
                numturns++;
                if (numturns > 4) {
                    return;
                }
            }
        }
    }
}
