import java.util.Scanner;

//arrays have [] which tells variable to hold multiple values

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //create an array to store values
        int maxval = Integer.MIN_VALUE;
        int[] values = new int[5];
        int index = 0;

        //loop for adding values to array
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter a value or q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")){
                //consume token.
                in.next();
                break;
            }
            int val = in.nextInt();

            //check for space in array
            if (index < values.length){
                // add current value to array
                values[index] = val;
                index++;

            //sets the max value
            if (val > maxval){
                maxval = val;
            }

            } else {
                // no more space.
                System.out.print("The array is now full. Exiting loop.");
                break;
            }
            
            
        }

        //display info to user
       // loop through the array and highlight the biggest
        System.out.println("here are the values entered: " );
        for (int i = 0; i < index; i++){
            System.out.print(values[i]);
            if (values[i] == maxval){
                System.out.print(" = biggest value");
            } else {
                System.out.println();
            }
        }

        //you can add your own values like this
        double[] moreValues = { 32, 54, 67.5, 29, 35, 80, 115, 44.5, 100, 65 };

        //this would only print the 4th word (word numbered #3)
        String[] orig = { "the", "quick", "brown", "fox", "jumped" };
        String[] reference = orig;
        System.out.println(reference[3]);



    }
}
