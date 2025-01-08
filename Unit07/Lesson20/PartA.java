import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        // create input file
        File inputFile = new File("csvfile.txt");

        // instance of scanner directed at input file
        Scanner in = new Scanner(inputFile);

        // change delimeter to anything thats not a letter, a number, an á, or a decimal
        // point
        in.useDelimiter("[^A-Za-zá0-9.]+");

        // add top of chart
        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name     |     Balance     ");
        System.out.println("---------------------------------------");

        // scan the file
        while (in.hasNext()) {
            int id = in.nextInt();
            String word = in.next();
            double balance = in.nextDouble();
            System.out.printf("%06d |", id);
            System.out.printf("%12s |", word);
            System.out.printf(" $ %,13.2f%n", balance);
        }

        // close file
        in.close();
    }
}
