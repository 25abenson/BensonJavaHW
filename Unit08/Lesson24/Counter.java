// Alex Benson
// Lesson 24 HW Part B
// 1/25/25

import java.util.Scanner;

public class Counter {
    // private varibale for count
    private int count = 0;

    // get value method
    public int getValue() {
        return count;
    }

    // add to count method
    public void count() {
        count = count + 1;
    }

    // reset count method
    public void reset() {
        count = 0;
    }

    public static void main(String[] args) {

        // create instance of scanner
        Scanner in = new Scanner(System.in);

        // create instance of the counter class for each dessert
        Counter cakecounter = new Counter();
        Counter piecounter = new Counter();

        // will loop until user types "q"
        while (true) {
            System.out.print("Do you like pie (p) or cake (c)? Or press q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                // if they quit the program display totals
                System.out.println("You have quit the program. Here are your totals: ");
                // pie count
                System.out.println("Pie: " + piecounter.getValue());
                // cake count
                System.out.println("Cake: " + cakecounter.getValue());
                break;
            } else if (in.hasNext("p") || in.hasNext("P")) {
                // if user types p add to pie count
                piecounter.count();
                in.next();
            } else if (in.hasNext("c") || in.hasNext("C")) {
                // if user types C add to cake count
                cakecounter.count();
                in.next();
            } else {
                // other non allowed input, the program resets
                System.out.println("Not one of the allowed inputs. Please try again.");
                in.next();
            }
        }
    }

}
