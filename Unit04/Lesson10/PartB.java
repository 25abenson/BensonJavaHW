//Alex Benson
// Lesson 10 Part B HW
// 10/31/24

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {

        //this was a compile time error because the discount varible was not initialized outside of the loop, so before the loop started I set the discount to 0 to fix this program
        //now the computer knows the value of this variable outside of the loop 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount = 0.0;
        
        if (num > 6) {
            discount = 0.05;
        } else if (num > 12) {
            discount = 0.10;
}
        System.out.println("Discount = " + discount);  

    }
}
