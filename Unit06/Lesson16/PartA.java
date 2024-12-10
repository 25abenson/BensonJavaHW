//Alex Benson
// Lesson 16 HW Part A
// 12/9/24

import java.util.Arrays;
import java.util.Scanner;


public class PartA {

    public static void dropLowest(double[] values){
        Arrays.sort(values);
        int currentSize = values.length;
        for (int i = 0 + 1; i < currentSize; i++){
            values[i-1] = values [i];
        }
        currentSize = currentSize - 1;
        System.out.println("Your new scores are: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize-1) {
                System.out.print(", ");
            }
            
        } 
        
        
    }

    public static void main(String[] args) {

        //instance of scanner
        Scanner in = new Scanner(System.in);
        
        //create arrays
         final int LENGTH = 100; //do this later
        double[] quizScores = new double[LENGTH];
        int currentLength = 0;

        //loop that adds values to the array
    while (true){
        System.out.print("Enter a score or q to quit: ");

    //if the input is a Q...
    if (in.hasNext("q") || in.hasNext("Q")){
        //consume the Q
        in.next();
        //break loop
        System.out.println("Done with input.");
        break;
   }

   //check if there is space in the array
   if (currentLength < quizScores.length){
    //read in the value
      quizScores[currentLength] = in.nextDouble();
      currentLength++;
   }
   else {
    //it is full
    System.out.println("Array is full.");
    System.out.println("Done with input.");
    break;
   }
   
}

        //print the array
        System.out.println("Your scores are: ");
        for (int i = 0; i < currentLength; i++) {
            System.out.print(quizScores[i]);
            if (i < currentLength-1) {
                System.out.print(", ");
            }
            
        } 

        //ask user to drop lowest score
        System.out.println();
        System.out.print("Would you like to drop the lowest score (y or n): ");
        if (in.hasNext("y")||in.hasNext("Y")){
            double[] quizCopy = Arrays.copyOf(quizScores, currentLength);
           dropLowest(quizCopy);
        } else {
            System.out.println("Ok, keep the score the same! Goodbye!");
        }


    }
}
