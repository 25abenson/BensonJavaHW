//Alex Benson
// Lesson 10 Part D HW
// 10/31/24

/*Create a nested Create a nested for loop to produce the following output.
....1
...22
..333
.4444
55555
*/

public class PartD {
    public static void main(String[] args) {
        int num = 1;
        int numTimes = 1;
        //below will print the following output for each condition
        for (int i = 1; i < 2; i++){
            for (int numdots = 1; numdots < 5; numdots++){
                System.out.print(".");
            } System.out.println("1");
            for (int numdots = 1; numdots < 4; numdots++){
                System.out.print(".");
            } System.out.println("22");
            for (int numdots = 1; numdots < 3; numdots++){
                System.out.print(".");
            } System.out.println("333");
            for (int numdots = 1; numdots < 2; numdots++){
                System.out.print(".");
            } System.out.println("4444");
            for (int numdots = 1; numdots < 1; numdots++){
                System.out.print(".");
            } System.out.println("55555");
           
        }

        // here is also another way to do it cuz i dont think i nested the loops correctly above

         int n = 5; // Number of rows, this way you can change the number of times the program runs

        for (int i = 1; i <= n; i++) {
            // Print leading dots corresponds to integer you are printing
            for (int b = n; b > i; b--) {
                System.out.print(".");
            }

            // Print the number the number of times u need it
            for (int a = 1; a <= i; a++) {
                System.out.print(i);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
