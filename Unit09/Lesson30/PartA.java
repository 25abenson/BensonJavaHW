import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        // scanner instance
        Scanner in = new Scanner(System.in);

        // create array list of employees
        ArrayList<Employee> employees = new ArrayList<>();

        // loop to add employees
        while (true) {
            System.out.print("Enter a letter ((E)mployee, (M)anager, (C)EO or (Q)uit): ");
            String choice = in.nextLine().toLowerCase();
            String name;
            double salary;
            double bonus;
            int numShares;

            // if quit then quit program and exit loop
            if (choice.equals("q")) {
                // exit the loop.
                break;
            } else if (choice.equals("e") || choice.equals("E")) {
                // create a new employee;
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                Employee employee = new Employee(name, salary);

                // add to array list.
                employees.add(employee);

            } else if (choice.equals("m") || choice.equals("M")) {
                // create a new manager;
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                Manager manager = new Manager(name, salary, bonus);

                // add to array list.
                employees.add(manager);

            } else if (choice.equals("c") || choice.equals("C")) {
                // create a new executive;
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                System.out.print("Enter number of shares: ");
                numShares = Integer.parseInt(in.nextLine());
                Executive executive = new Executive(name, salary, bonus, numShares);

                // add to array list.
                employees.add(executive);
            } else {
                System.out.println("I don't understand your choice.");
            }

            // put a newline to make it easier to read.
            System.out.println();
        }

        // insert newline to make it easier to read.
        System.out.println();

        // after entering in data, loop through the array list and display info.
        System.out.printf("Your company has %d employees.%n", employees.size());
        System.out.println();

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
