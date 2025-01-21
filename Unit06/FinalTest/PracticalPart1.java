//Alex Benson
// Unit 5/6 Test
// Practical Problem 1

import java.util.Arrays;

public class PracticalPart1 {

    // swap method
    public static int[] swap(int a, int b, int[] values) {
        // if a and b are within the range of the array then begin swap
        if ((a > 0 && a < values.length) && (b > 0 && b < values.length)) {
            // creates an integer for b value
            int bvalue = values[b];
            // creates an integer for a value
            int avalue = values[a];

            // sets value @ a in array to the b value
            values[a] = bvalue;
            // sets value @ b in array to the a value
            values[b] = avalue;
            // returns new altered array
            return values;
        } else { // if a and b are outside range of array then display error message to user and
                 // return unaltered array
            System.out.println("A and B are not within the range of the array, unable to alter array.");
            return values;
        }
    }

    public static void main(String[] args) {
        // create test array
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // use swap function
        swap(2, 7, numbers);
        // print new array
        System.out.println(Arrays.toString(numbers));

    }
}