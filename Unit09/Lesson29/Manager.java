
public class Manager extends Employee {

    double bonus;

    // constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // get annual salary
    public double getAnnualIncome() {
        double annualSalary = getSalary();
        annualSalary = annualSalary + bonus;
        return annualSalary;
    }

}
