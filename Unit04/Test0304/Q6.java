// Alex Benson
// Practical Test for Unit 03 and 04
// Question 6


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //creates instance of scanner class
        Scanner in = new Scanner(System.in);
        
        //gets integers from user
        System.out.print("Enter 3 integers: ");
        int int1 = in.nextInt();
        int int2 = in.nextInt();
        int int3 = in.nextInt();

        // if int 1 is greater then print int 1
        if (int1 > int2 && int1 > int3){
            System.out.print(int1 + ", ");
            if (int2 > int3){
                //then print int 2 if greater than int 3 and then print int 3
                System.out.print(int2 + ", ");
                System.out.print(int3);
            } else if (int3 > int2){
                //or if int 3 is greater print int 3 then int 2
                System.out.print(int3 + ", ");
                System.out.print(int2);
            }
        // if int 2 is greater then print int 2
        } else if (int2 > int1 && int2 > int3){
            System.out.print(int2 + ", ");
            if (int1 > int3){
                //then print int 1 if greater than int 3 and then print int 3
                System.out.print(int1 + ", ");
                System.out.print(int3);
            } else if (int3 > int1){
                //or if int 3 is greater print int 3 then int 1
                System.out.print(int3 + ", ");
                System.out.print(int1);
            }
        // if int 3 is greater then print int 3
        }else if (int3 > int1 && int3 > int2){
            System.out.print(int3 + ", ");
            if (int1 > int2){
                //then print int 1 if greater than int 2 and then print int 2
                System.out.print(int1 + ", ");
                System.out.print(int2);
            } else if (int2 > int1){
                //or if int 2 is greater print int 2 then int 1
                System.out.print(int2 + ", ");
                System.out.print(int1);
            }
        }


    }
}
