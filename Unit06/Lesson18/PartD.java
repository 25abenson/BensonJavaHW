//Alex Benson
// Lesson 18 Part D HW
// 12/13/24

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartD {

    public static void main(String[] args) {
        //instance of scanner class
    Scanner in = new Scanner(System.in);

    //create array list
    ArrayList<Integer> integers = new ArrayList<Integer>();

    //add elements to array list
    while (true){
        System.out.print("Enter an integer or q to quit: ");

        if (in.hasNext("Q")|| in.hasNext("q")){
            System.out.println("Done with input!");
            break;
        } else {
            integers.add(in.nextInt());
        }
    }

    //remove odd numbers
    for (int i = 0; i < integers.size(); i++){
        if (integers.get(i) % 2 != 0){
            integers.remove(i);
        }
    }

    for (int i = 0; i < integers.size(); i++){
        if (integers.get(i) % 2 != 0){
            integers.remove(i);
        }
    }

    //print array list
    for (int i = 0; i < integers.size(); i++){
        System.out.println(integers.get(i));
    }

}
}
