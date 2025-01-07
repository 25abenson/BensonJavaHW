import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("scores.txt");
        Scanner in = new Scanner(inputfile);
        while (in.hasNext()) {
            double score = in.nextDouble();
            System.out.printf("%6.2f%n", score);
        }

        in.close();

    }
}