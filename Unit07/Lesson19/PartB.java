import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        // create input file
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        // create output file
        File outputFile = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(outputFile);

        // keep track of number of quizzes
        int quiznum = 0;

        // calculate total
        double total = 0;

        // read input file and format it into the output file
        while (in.hasNext()) {
            double score = in.nextDouble();
            out.printf("Quiz %03d", quiznum);
            out.printf(": %6.2f%n", score);
            quiznum++;
            total = total + score;
        }

        // calculate average
        double average = total / quiznum;

        // organize file by adding a line below the scores and then print the average in
        // the output file
        out.println("----------------");
        out.printf("Average = %6.2f", average);

        // close out both files
        in.close();
        out.close();
    }
}
