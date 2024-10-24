// Alex Benson
// AT05 Challenge 
// Part A
// 10/24/24

//imports in the Random class
import java.util.Random;

public class PartA {
    public static void main(String[] args) {
        
        //creates an instance of the random class
        Random randomNUM = new Random();

        //creates a loop that will print 100 integers between 0-100
        for (int i = 0; i<100; i++){
            int random = randomNUM.nextInt(100);
            System.out.println(random);
        }


    }



}