
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

    // get bonus
    public double getBonus() {
        return bonus;
    }

    // display info
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Bonus = $%,13.2f%n", bonus);
    }

}
