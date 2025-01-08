import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Character;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        // creates file to read
        File inputFile = new File("characters.txt");

        // creates scanner instance that reads the input file
        Scanner in = new Scanner(inputFile);

        // changes delimiter to nothing so it must read charcter by character
        in.useDelimiter("");

        // creates count of charcters
        int charcount = 0;
        int lettercount = 0;
        int numcount = 0;

        // goes through file and reads it by character
        while (in.hasNext()) {
            // add to character count
            charcount++;
            char c = in.next().charAt(0);
            System.out.print(c);
            // if its a letter add to letter count
            if (Character.isLetter(c)) {
                lettercount++;
            }
            // if its a number add to digit count
            if (Character.isDigit(c)) {
                numcount++;
            }
        }

        System.out.println();

        // displays values to user
        System.out.printf("count = %d%n", charcount);
        System.out.printf("letters = %d%n", lettercount);
        System.out.printf("digits = %d%n", numcount);
    }
}
