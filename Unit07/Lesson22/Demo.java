import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        File inputfile = new File("missing.txt");
        Scanner in;

        try {
            // try to open the file
            in = new Scanner(inputfile);
            System.out.println("File was opened successfully!");
            while (in.hasNext()) {
                System.out.println(in.next());
            }
            in.close();

            // if file cannot be found
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.err.print("Ending program run.");
            return;

        }

    }
}