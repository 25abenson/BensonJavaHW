// Alex Benson
// Part A Lesson 22 HW
// 1/14/25

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class PartA {
    public static void main(String[] args) {

        // create first Scanner
        Scanner input = new Scanner(System.in);

        // ask user to name file
        System.out.println("to help you, the file text.txt exists");
        while (true) {
            System.out
                    .print("What is the name of the file you are looking for (include.txt at the end) or # to quit: ");
            String fileword = input.nextLine();
            if (fileword.equals("#")) {
                // quit the program if user enters (#)
                System.out.println("You have quit the program! Goodbye!");
                break;
            } else {
                String filename = fileword;

                // create file Scanner
                Scanner in;
                try {
                    // find file
                    File inputfile = new File(filename);
                    in = new Scanner(inputfile);
                    // print on seperate lines
                    while (in.hasNext()) {
                        String word = in.next();
                        System.out.println(word);
                    }
                    in.close();
                    // if file is not found print exception message and start program again
                } catch (FileNotFoundException e) {
                    System.err.println(e.getMessage());
                    System.err.println("Try another file name.");
                }
            }
        }

    }
}
