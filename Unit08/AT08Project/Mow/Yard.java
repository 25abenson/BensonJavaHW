package Mow;

import java.util.Scanner;

class Yard {

    private int length;
    private int width;
    private char[][] yard;

    private char border = 'R';
    private char unmowed = '+';
    private char mowed = ' ';

    // constructor for lawn, fills the yard array
    public Yard(int numrows, int numcolums) {
        length = numrows + 2;
        width = numcolums + 2;
        yard = new char[length][width];
        // traverse the array.
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (row == 0) {
                    // if first row make it a border
                    yard[row][col] = border;
                } else if (row == yard.length - 1) {
                    // if last row make it a border
                    yard[row][col] = border;
                } else if (col == 0) {
                    // if first colum make it a border
                    yard[row][col] = border;
                } else if (col == yard[0].length - 1) {
                    // if second colum make it a border
                    yard[row][col] = border;
                } else {
                    yard[row][col] = unmowed;
                }
            }
        }
    }

    // returns the character (lawn square)
    public char getLawnSquare(int row, int colum) {
        return yard[row][colum];
    }

    // this method allows you to overwrite an element of the array
    public char setLawnSquare(int row, int colum, char newSquare) {
        yard[row][colum] = newSquare;
        return yard[row][colum];
    }

    // method that returns height of lawn
    public int getHeight() {
        int height = yard.length - 2;
        return height;
    }

    // get width of the lawn
    public int getWidth() {
        int width = yard[0].length - 2;
        return width;
    }

    // method to print the lawn
    public void printLawn() {
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                System.out.print(yard[row][col]);
            }
            System.out.println();
        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        // initialize scanner
        Scanner in = new Scanner(System.in);

        // clear screen
        clearScreen();

        // prompt user for length and width of yard
        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int width = in.nextInt();

        // create lawn
        Yard myLawn = new Yard(height, width);

        System.out.println();

        // print lawn
        myLawn.printLawn();
    }

}