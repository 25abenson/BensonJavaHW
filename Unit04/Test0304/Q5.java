// Alex Benson
// Practical Unit 03 and 04 test
// Question 5


public class Q5{
    public static void main(String[] args) {
       
        //assigns varibles
        int count = 100;
        double totalofInt = 0;

        //loop that includes 1-100 and adds the integers to the total
        for (int i = 1; i <= 100; i++){
            totalofInt = totalofInt + i;
        }

        //calculates and displays average to user
        double av = totalofInt / count;
        System.out.printf("average = %.2f", av);


    }
}