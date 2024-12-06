//Alex Benson
// Lesson 15 Part A HW
// 12/5/24

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
   
   public static void main(String[] args) {
    
    //create array size 10 and a variable that tracks the size of the array
    final int LENGTH = 10;
    double[] values = new double[LENGTH];
    int currentSize = 0;

    //instance of scanner class
    Scanner in = new Scanner(System.in);

    //loop that adds values to the array
    while (true){
        System.out.print("Enter a number or q to quit: ");

    //if the input is a Q...
    if (in.hasNext("q") || in.hasNext("Q")){
        //consume the Q
        in.next();
        //break loop
        System.out.println("Done with input.");
        break;
   }

   //check if there is space in the array
   if (currentSize < values.length){
    //read in the value
      values[currentSize] = in.nextDouble();
      currentSize++;
   }
   else {
    //it is full
    System.out.println("Array is full.");
    System.out.println("Done with input.");
    break;
   }
   
}

//display formatted info to user 
System.out.print("*");
 for (int i = 0; i < currentSize; i++) {
            if (i > 0) {
                System.out.print(" * ");
            }
            System.out.print(values[i]);
        }
System.out.print("*");

//sort the array

double[] copy = Arrays.copyOf(values, currentSize);
Arrays.sort(copy, 0, copy.length);

//print out the formatted sorted array

System.out.println();

for (int i = copy.length - 1; i >= 0; i--) {
            
            System.out.print(copy[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }

   }

}
