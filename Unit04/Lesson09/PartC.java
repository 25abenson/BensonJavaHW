// Alex Benson
// HW Lesson09 Part C
// 10/27/24

public class PartC {

    public static void main(String[] args) {
        //assigns variable
        double total = 0;

       //loop will occur ten times
        for (int i = 1; i <= 10; i++){
            //this makes the randomly generated number multiplied by ten and added to one so it is between 1-10
            // it is then casted as an integer
            int randomNUM = (int)(Math.random() * 10) + 1;
            //prints the integer
            System.out.println(randomNUM);
            //adds integer to total
            total = total + randomNUM;

        }

        //calculates average (will be around 5 because the random numbers between one and ten will average out to the middle value between these numbers which is 5)
        double average = total / 10;
        //displays output to user
        System.out.println("The average of these numbers is: " + average);

    }

}
