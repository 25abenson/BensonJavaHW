import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        // create Scanner object to get data.
        Scanner input = new Scanner(System.in);

        // provide instructions to user before
        // we begin our loop.
        System.out.println("Enter in data as double values (or 'q' to quit).");

        // declare the variables I will need to track values.
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double val = 0;
        double total = 0;
        int count = 0;

        // use a loop flag to determine whether or not to loop.
        boolean loopFlag = true;
        while (loopFlag) {
            // does the user want to quit?
            if (input.hasNext("q") || input.hasNext("Q")) {
                // done getting data.
                loopFlag = false;
            } else {
                // assume we do not have to do input validation.
                val = input.nextDouble();

                // increment the total and count variables.
                total = total + val;
                count = count + 1;

                // find max and min.
                if (val > max) {
                    max = val;
                }
                if (val < min) {
                    min = val;
                }
            }
        }

        // print the values.
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("count = " + count);
        System.out.printf("avg = %.2f%n", (total / count));       
    }    
    
}
