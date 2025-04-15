import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationWriting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee.lastIDUsed = 0;

        // get data from user
        while (true) {

            System.out.print("Enter e to add employee or q to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.nextLine();
                System.out.println("Done inputting data.");
                break;
            } else {
                in.nextLine();
                System.out.print("Enter first name: ");
                String firstname = in.nextLine();

                System.out.print("Enter last name: ");
                String lastname = in.nextLine();

                System.out.print("Enter salary: ");
                double salary = in.nextDouble();

                Employee.lastIDUsed++;
                Employee newEmployee = new Employee(firstname, lastname, Employee.lastIDUsed, salary);
                employees.add(newEmployee);

            }
        }

        // display data
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName());
        }

        // record to file.
        String filepath = "data.bin";
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {

            // save the last ID used info.
            dataOutputStream.writeInt(Employee.lastIDUsed);
            for (Employee newEmployee : employees) {
                newEmployee.writeToStream(dataOutputStream);
            }

            // we're done. the streams should automatically be closed as we exit the try
            // with resources clause.
            System.out.println("Data saved to \"" + filepath + "\"");
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }

    }
}
