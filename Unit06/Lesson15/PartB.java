//Alex Benson
// Lesson 15 Part B HW
// 12/5/24

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
    
    //create array size 10 and a variable that tracks the size of the array
    final int LENGTH = 20;
    int[] values = new int[LENGTH];
    int currentSize = 0;

    //instance of scanner class
    Scanner in = new Scanner(System.in);

    //loop that adds values to the array
    while (true){
        System.out.print("Enter an integer or q to quit: ");

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
      values[currentSize] = in.nextInt();
      currentSize++;
   }
   else {
    //it is full
    System.out.println("Array is full.");
    System.out.println("Done with input.");
    break;
   }
   
}

//display info to user
for (int i = 0; i < currentSize; i++) {
            
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(values[i]);
        }
//prompt user for target value
System.out.println();
System.out.print("Enter a target integer value: ");

int numofValue = 0;
int searchedValue = in.nextInt();

//loop to search through the array
        for (int pos = 0; pos < currentSize; pos++) {
            if (values[pos] == searchedValue) {
                numofValue++;
            } 
        }

//display info to user
if (numofValue == 1){
    System.out.println("Your value " + searchedValue + " was found 1 time in your program. ");}
    else {
    System.out.println("Your value " + searchedValue + " was found " + numofValue + " times in this program.");
    }
}



    }

   

