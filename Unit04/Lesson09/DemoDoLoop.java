import java.util.Scanner;


public class DemoDoLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //sets variables outside the loop so they exist outside of it
        double current = 0;
        double total = 0;

        //this loop will continue until the while statement becomes false, do loop
        do {
            System.out.print("Enter dollar amount: ");
            //assigns current to the entered value
            //checks to make sure the value is a double
            if (in.hasNextDouble()){
                current = in.nextDouble();
            } else {
                System.err.println("Input double values only.");
                in.next();
            }
            
            //adds total to current to get new total
            total = total + current;

        } while (current >= 0);

        //prints the total to the user
        System.out.println("Your total spent is: " + total);




    }
}