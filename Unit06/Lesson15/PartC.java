//Alex Benson
// Lesson 15 Part C HW
// 12/5/24

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class PartC {

    //create linear search method
    public static int linearSearch(int[] array, int tgtVal){

        int numofValue = 0;

        //loop to search through the array
        for (int pos = 0; pos < array.length; pos++) {
            if (array[pos] == tgtVal) {
                numofValue++;
            } 
        }
        //returns the integer number of times that number was found in the array
        return numofValue;
}

    
    public static void main(String[] args) {
        
        //creates an instance of the random class
        Random randomNUM = new Random();
        //create array size 10,000
        final int LENGTH = 10000;
        int[] array = new int[LENGTH];
        int currentSize = 0;
        
        //creates a loop that will add integers to array between 0-LENGTH
        for (int i = 0; i<LENGTH; i++){
            int random = randomNUM.nextInt(LENGTH);
            array[i] = random;
        }

        //copies the array so we have two arrays to search that are the same
        int copy[] = Arrays.copyOf(array, array.length);

        //this puts the copy array in numerical order for binary search
        Arrays.sort(copy);

        //records beginning of binary search time
    long binarystartTime = System.currentTimeMillis();

    //loop generates repeats ten times and generates a random target integer and scans through the array to find the random integer 
        for (int i = 0; i < 11; i++){
            int targetVal = randomNUM.nextInt(LENGTH);

            int binary = Arrays.binarySearch(copy, targetVal);

            //displays info to user (if int was found in array)
            if (binary >= 0) {
            System.out.println("The target integer was found in the array.");
        } else {
            System.out.println("Sorry, could not find target integer in the array.");
        }
    }

    //records end time for binary search
    long binaryendTime = System.currentTimeMillis();
    System.out.println();

    //prints time that it took to binary search
    System.out.println("The binary search took " + (binaryendTime - binarystartTime) + " milliseconds");
     System.out.println();
  
     //records start time of linear search
long linearstartTime = System.currentTimeMillis();

//loop generates repeats ten times and generates a random target integer and scans through the array to find the random integer 
for (int i = 0; i < 11; i++){
            int targetVal = randomNUM.nextInt(LENGTH);

            int linear = linearSearch(array, targetVal);

            //displays info to user (if int was found in array)
            if (linear >= 0) {
             System.out.println("The target integer was found in the array.");
        } else {
            System.out.println("Sorry, could not find target integer in the array.");
        }
    }
//records end time of linear search
long linearendTime = System.currentTimeMillis();
 System.out.println();

 //prints out time for linear search to user
System.out.println("The linear search took " + (linearendTime - linearstartTime) + " milliseconds");
 System.out.println();

        }

        } 

        //when i ran the program with the length of the array set to 10,000 the linear and binary search took mostly the same amount of time
        //but when the length was increased to 100,000 and then 10,000,000 the binary search was far more efficent and took less time


