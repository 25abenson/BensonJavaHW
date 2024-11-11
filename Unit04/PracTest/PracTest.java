//Alex Benson
// Practice Practical Exam
// 11/11/24

import java.util.Scanner;
public class PracTest{
    public static void main(String[] args) {

        //creating instance of scanner class
        Scanner in = new Scanner(System.in);

        //get input from user
        System.out.print("Enter number or enter q to quit: ");

         //assigns variables
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double currentNum = 0;
        double totalNum = 0;
        int numofNums = 0;

        boolean looping = true;

        while (looping){

            if (in.hasNext("q") || in.hasNext("Q")){
                //quit the program
                looping = false;
            } else{

                //assign current number
                currentNum = in.nextDouble();

                //adjust total and add another number to count of numbers
                totalNum = totalNum + currentNum;
                numofNums++;

                //finds min and max
                if (currentNum > max){
                    max = currentNum;
                }
                if (currentNum < min){
                    min = currentNum;
                }
    
            }


        }

        // print the values.
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("count = " + numofNums);
        System.out.printf("avg = %.2f%n", (totalNum / numofNums));       

        

    }
}