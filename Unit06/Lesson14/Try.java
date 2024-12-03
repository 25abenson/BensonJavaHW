import java.util.Scanner;

public class Try {
   
   public static void main(String[] args) {
    
    //create array size 100 and a variable that tracks the size of the array
    final int LENGTH = 100;
    double[] values = new double[LENGTH];
    int currentSize = 0;

    //instance of scanner class
    Scanner in = new Scanner(System.in);

    //loop that adds values to the array
    while (true){
        System.out.print("Enter test score or q to quit: ");

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

//calculate average
double average = values[currentSize] / currentSize;
   

//display formatted info to user 
System.out.println("------------------------");
for (int i = 0; i < currentSize; i++){
            int h = i + 1;
            System.out.printf("Test #%03d", h); 
            System.out.printf(": %12.2f%n", values[i]);
    }
System.out.println("------------------------");
System.out.printf("Average Score: %8.2f", average);

   }

}
