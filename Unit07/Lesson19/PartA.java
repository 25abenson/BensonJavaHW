import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        // creates file
        File inputfile = new File("temps.txt");

        // creates instance of scanner with the file as input
        Scanner in = new Scanner(inputfile);

        // create array list
        ArrayList<Integer> temps = new ArrayList<Integer>();

        // add elements of file to array list
        while (in.hasNext()) {
            int temp = in.nextInt();
            temps.add(temp);
        }

        in.close();

        // determine lowest temp
        int lowestTemp = Collections.min(temps);

        // iterate through list and print on seperate lines
        for (int i = 0; i < temps.size(); i++) {

            if (temps.get(i) == lowestTemp) {
                System.out.println(temps.get(i) + " <= lowest temp");
            } else {
                System.out.println(temps.get(i));
            }

        }
    }
}