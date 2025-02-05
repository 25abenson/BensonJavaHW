//Alex Benson
//Lesson 29 HW Part B
// 2/5/25

public class PartB {
    public static void main(String[] args) {

        // create instances of employee and manager
        Manager bossLady = new Manager("Sarah", 200000, 50000);
        Employee nonBossLady = new Employee("Kim", 150000);

        // display info
        System.out.printf(" %-6s : salary = $%,12.2f; annual income = $%,12.2f%n", bossLady.getName(),
                bossLady.getSalary(), bossLady.getAnnualIncome());
        System.out.printf(" %-6s : salary = $%,12.2f; annual income = $%,12.2f%n", nonBossLady.getName(),
                nonBossLady.getSalary(), nonBossLady.getAnnualIncome());
    }
}
