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

        // create instance of yard
        Yard myYard = new Yard(10, 20);

        // create instance of mower
        Mower myMower = new Mower();

        // set mower and initialize it to top corner
        myMower.setDirection(1);
        myMower.setHorizontalPos(1);
        myMower.setVerticalPos(1);
        myMower.mowSpace(myYard);

        // print the lawn
        myYard.printLawn(myMower);

        // move mower and mow for length of lawn
        for (int i = 0; i < myYard.getWidth() - 1; i++) {
            myMower.moveMower();
            myMower.mowSpace(myYard);
            delay(500);
            clearScreen();
            myYard.printLawn(myMower);

        }
    }
}
