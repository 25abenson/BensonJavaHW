public class Executive extends Manager {

    private int numShares;

    // constructor
    public Executive(String name, double salary, double bonus, int numShares) {
        super(name, salary, bonus);
        this.numShares = numShares;
    }

    // get numShares
    public int getShares() {
        return numShares;
    }

    // display info
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Shares = %5d%n", numShares);
    }

}
