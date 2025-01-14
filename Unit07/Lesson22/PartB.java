//Alex Benson
//Part B Lesson 22 HW
// 1/14/25

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("birthyears.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()) {
            // set delimiter to comma or new line
            in.useDelimiter("[,\n]+");
            // read in name
            String name = in.next();
            // read in year
            String word = in.next();
            int year;
            try { // if it is a year print the year
                year = Integer.parseInt(word);
                System.out.println(name + "'s birth year is " + year + ".");
            } catch (NumberFormatException notnum) {
                // if not a year say it is unknown
                System.out.println(name + "'s birth year is unknown.");
            }
        }
        in.close();

    }
}
