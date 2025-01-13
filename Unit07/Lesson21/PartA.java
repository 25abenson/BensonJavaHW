// Alex Benson
// Part A Lesson 21 HW
// 1/13/25

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        // import file
        File inputfile = new File("Top5Unemployment.txt");

        // create file scanner
        Scanner in = new Scanner(inputfile);

        // format and title information
        System.out.println("-------------------------------------------------------------");
        System.out.println("                  Top 5 Unemployment Rates");
        System.out.println("-------------------------------------------------------------");

        // iterate through line by line
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            double percentage = Double.valueOf(nextWord);
            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord);
            String region = lineScanner.next().trim();

            // format the output
            System.out.printf("Ranked #%3d: %-16s| %6.2f%%| %-20s%n",
                    rank, name, percentage, region);

        }
        System.out.println("-------------------------------------------------------------");

    }
}
