public class InvertedTrianle {

    public static void invertedTriangle(int n) {

        if (n == 0) {
            return;
        } else if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 1.");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

            invertedTriangle(n - 1);
        }
    }

    public static void printInverted(int n) {

    }

    public static void main(String[] args) {
        invertedTriangle(5);
    }

}
