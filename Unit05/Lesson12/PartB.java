// Alex Benson
// Lesson 12 HW Part B
// 11/13/24

import java.util.Scanner;

public class PartB {
    
public static double smallest(double x, double y, double z){
    //return x if smallest
    if (x < y && x < z){
        return x;
    }
    //return y if smallest
    else if (y < z && y < x) {
        return y;
    }
    else { // else return z
        return z;
    }
}

public static void main(String[] args) {
    //initialize scanner
    Scanner in = new Scanner(System.in);

    //Get input from user
    System.out.print("Enter 3 numbers: ");

    //assign varibles
    double int1 = in.nextDouble();
    double int2 = in.nextDouble();
    double int3 = in.nextDouble();

    //call method smallest
    double small = smallest(int1, int2, int3);

    //display info to user
    System.out.print("The smallest of your three numbers is " + small);

}


}
