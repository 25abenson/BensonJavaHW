//Alex Benson
// HW Lesson 17 Part B
// 10/11/24


import java.util.Arrays;

public class PartB{

    //create method
    public static void printArrays(int[][] array){

        //iterate throuhg rows
        for (int row = 0; row < array.length; row++) {
            //iterate through colums
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col]);
                // only print a comma if it's not the last column.
                if (col < array[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        
        //declare first array
        int[][] first = {
            {8, 6, 7},
            {5, 3, 0}
        };

        //declare second array
        int[][] second = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };

        //print the arrays by calling the method
        System.out.println("Here is the first array: ");
        printArrays(first);
        System.out.println("Here is the second array: ");
        printArrays(second);


        
    }
}