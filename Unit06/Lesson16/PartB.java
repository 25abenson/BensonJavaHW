// Alex Benson
// HW Lesson 16 Part B
// 10/9/24


public class PartB {

    public static double average(double... values){
        double total = 0;
        for (int i = 0; i < values.length; i++){ // values is an int[]
            total = total + values[i];} 
        double average = total / values.length;
        return average;}

    public static void main(String[] args) {
        double[] scores = {100, 90, 80, 100, 80};
        System.out.println("The average of 8, 10, and 10 is: " + average(10, 8, 10));
        System.out.println("The average of the array scores is equal to: " + average(scores));
    }
}
