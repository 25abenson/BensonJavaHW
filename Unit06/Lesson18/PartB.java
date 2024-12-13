//Alex Benson
// Lesson 18 Part B HW
// 12/13/24

import java.util.ArrayList;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        //instance of scanner class
    Scanner in = new Scanner(System.in);

    //create array list
    ArrayList<Double> testscores = new ArrayList<Double>();

    //add elements to array list
    while (true){
        System.out.print("Enter a test score or q to quit: ");

        if (in.hasNext("Q")|| in.hasNext("q")){
            System.out.println("Done with input!");
            break;
        } else {
            testscores.add(in.nextDouble());
        }
    }

    //iterate through list and print on seperate lines
    for (int i = 0; i < testscores.size(); i++){
        System.out.printf("%.2f%n", testscores.get(i));
    }

    double total = 0;

    //get total
    for (int i = 0; i < testscores.size(); i++){
        total = total + testscores.get(i);
    }

    //calculate average
    double average = total / testscores.size();

    System.out.println("The average of the test scores is: " + average);





    

}

}
