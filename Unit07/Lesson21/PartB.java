//Alex Benson
// Part B HW Lesson 21
// 1/13/25

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        // import file
        File inputfile = new File("sales_by_cat.txt");

        // create file scanner
        Scanner in = new Scanner(inputfile);

        // iterate through line by line
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);

            // established delimiter
            lineScanner.useDelimiter("[,\\s\\n]+");

            // sets first word to dept
            String dept = lineScanner.next();

            // sets second word to manager
            String manager = lineScanner.next();

            // creates expense varible
            double expense;
            if (lineScanner.hasNextDouble()) {
                // sets expense to double if one is there
                expense = lineScanner.nextDouble();
            } else {
                // skip over the "n/a"
                lineScanner.next();
                expense = 0.0;
            }

            // print info to user
            System.out.printf("%-17s | %-10s | $%10.2f%n", dept, manager, expense);
        }

        // close out file
        in.close();

    }
}
