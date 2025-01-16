import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    // method to throw your own exception
    public static int getAge(Scanner in) {

        System.out.print("Tell me your age: ");
        int age = in.nextInt();
        if (age <= 0) {
            throw new ArithmeticException("Age must be greater than zero.");
        } else {
            return age;
        }
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("integers.txt");
            Scanner in = new Scanner(inputFile);
            Scanner input = new Scanner(System.in);
            while (in.hasNext()) {
                int number = 0;
                try {
                    number = in.nextInt();
                    System.out.println("number = " + number);
                } catch (InputMismatchException e) {
                    // make sure to either eat the token or include it
                    String token = in.next();
                    System.err.println("number = " + token);
                }

            }

            getAge(input);
        } catch (FileNotFoundException e) {
            System.err.println("Error: FileNotFoundException");
            System.err.println("Unable to open the file for reading.");
        }
    }

}
