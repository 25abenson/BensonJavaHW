import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("Top5Population.txt");
        Scanner in = new Scanner(inputFile);

        File newFile = new File("Top5Obesity.txt");
        Scanner input = new Scanner(newFile);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            int i = 0;
            while (Character.isDigit(line.charAt(i)) == false) {
                i++;
            }
            String name = line.substring(0, i);
            name = name.trim();
            int pop = Integer.valueOf(line.substring(i).trim());
            System.out.printf("%16s: %,16d%n", name, pop);
        }

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\n]+");
            String name = lineScanner.next().trim();
            String nextWord = lineScanner.next().trim();
            double percentage = Double.valueOf(nextWord);
            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord);
            String region = lineScanner.next().trim();

            System.out.printf("Ranked #%3d: %16s, %6.2f%%, %20s%n",
                    rank, name, percentage, region);
        }

        in.close();
        input.close();

    }
}