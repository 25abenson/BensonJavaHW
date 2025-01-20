import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeTest {
    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("data.txt");
        Scanner in = new Scanner(inputfile);
        ArrayList<Integer> values = new ArrayList<Integer>();

        File outputfile = new File("out_A.txt");
        PrintWriter output = new PrintWriter(outputfile);

        while (in.hasNext()) {
            int newval = in.nextInt();
            values.add(newval);
        }

        int valnum = 0;
        int highest = values.get(0);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) > highest) {
                highest = values.get(i);
            }
        }
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == highest) {
                output.printf("value #%03d: %4d  <== highest", valnum, values.get(i));
                valnum++;
            } else {
                output.printf("value #%03d: %4d%n", valnum, values.get(i));
                valnum++;
            }
        }

        in.close();
        output.close();

    }
}
