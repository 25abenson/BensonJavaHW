//Alex Benson
// Lesson 18 Part C HW
// 12/13/24

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartC {

    public static void main(String[] args) {
        //instance of scanner class
    Scanner in = new Scanner(System.in);

    //create array list
    ArrayList<Integer> temperatures = new ArrayList<Integer>();

    //add elements to array list
    while (true){
        System.out.print("Enter a temperature or q to quit: ");

        if (in.hasNext("Q")|| in.hasNext("q")){
            System.out.println("Done with input!");
            break;
        } else {
            temperatures.add(in.nextInt());
        }
    }

    int lowestTemp = Collections.min(temperatures);

    //iterate through list and print on seperate lines
    for (int i = 0; i < temperatures.size(); i++){

        if (temperatures.get(i) == lowestTemp){
            System.out.println(temperatures.get(i) + " <= lowest temp");
        } else {
            System.out.println(temperatures.get(i));
        }
}

    }
}
