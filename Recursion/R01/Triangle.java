public class Triangle {

    public static void printTriangle(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        triangleHelp(1, n);
    }

    private static void triangleHelp(int current, int max) {
        if (current > max) {
            return;
        }

        // Print current number of stars
        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Recursive call for the next line
        triangleHelp(current + 1, max);
    }

    public static void main(String[] args) {
        printTriangle(5);
    }

}
