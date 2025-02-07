public class Employee {

    // establish member variables
    private String name;
    private double salary;

    /*
     * Constructor.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /// get name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String newName) {
        name = newName;
    }

    // get salary
    public double getSalary() {
        return salary;
    }

    // set salary
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    // get annual income
    public double getAnnualIncome() {
        // Employees only get an annual salary.
        return getSalary();
    }

    // display info
    public void displayInfo() {
        System.out.printf("Name: %-6s%nSalary = $%,12.2f%n", name,
                salary);
    }
}
