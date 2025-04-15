import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SerializationRead {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();

        String filepath = "data.bin";
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // save the last ID used info.
            Employee.lastIDUsed = dataInputStream.readInt();
            while (true) {
                try {
                    Employee e = new Employee();
                    e.readFromStream(dataInputStream);
                    employees.add(e);
                    e.displayInfo();
                } catch (EOFException e) {
                    System.out.println("End of file reached.");
                    break;
                }
            }

        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }

    }

}
