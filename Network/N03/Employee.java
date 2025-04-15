import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static int lastIDUsed = 0;

    private int id;
    private double salary;
    private String firstName;
    private String lastName;

    // constructor.
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
        this.salary = 0;
    }

    public Employee(String firstName, String lastName, int id, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void displayInfo() {
        System.out.printf("%s, %s:%n", lastName, firstName);
        System.out.printf("  ID #   = %06d%n", id);
        System.out.printf("  Salary = $%,.2f%n", salary);
    }

    public void writeToStream(DataOutputStream outputStream) throws IOException {
        // write the contents to output stream
        outputStream.writeInt(id);
        outputStream.writeDouble(salary);
        outputStream.writeUTF(firstName);
        outputStream.writeUTF(lastName);
    }

    public void readFromStream(DataInputStream inputStream) throws IOException {
        // read in fields from the input stream
        this.id = inputStream.readInt();
        this.salary = inputStream.readDouble();
        this.firstName = inputStream.readUTF();
        this.lastName = inputStream.readUTF();
    }

}
