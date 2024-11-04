// Alex Benson
// Lesson 11 HW Part C
// 11/4/24

//import scanner class
import java.util.Scanner;

 
public class PartC {
    public static void main(String[] args) {
    //creates instance of scanner class
       Scanner in = new Scanner(System.in); 
    //prompts user for input
       System.out.print("Enter radius: ");
    //stores input as the radius variables
       double radius = in.nextDouble();
    //calculates volume using static volume method
       double volume = volume(radius);
    //displays info to user
       System.out.println("Volume = " + volume + " units");
       
}

//creates method for volume
    public static double volume(double x){
        //volume is equal to Vol=4/3 * pi * radius to the third
        double volume = (4.0 / 3.0) * Math.PI * (x * x * x);
        //returns the volume 
        return volume;
}
}

