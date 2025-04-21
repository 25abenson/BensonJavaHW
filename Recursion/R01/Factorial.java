public class Factorial {

    // factorial recursion
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else if (n < 1) {
            throw new IllegalArgumentException("n must be greater than or equal to 1.");
        } else {
            return n * factorial(n - 1);
        }
    }

    // format factorial
    public static void doFactorial(int n) {
        System.out.printf("factorial(%d) = %d%n", n, factorial(n));
    }

    public static void main(String[] args) {

    }
}