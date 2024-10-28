// Alex Benson
// Lesson09 HW Part D
// 10/27/24

/*
 * List of ways to interact with the die
 * 1. Set (s), the user will be able to chose an integer 1-6 to set the die
 * 2. roll (r), the user can randomize whichever number 1-6 the die can land on
 * 3. view (d), the user can see the face of the die
 * 4. throw the die off the table (q), this ends the game as the person has now lost the die
 */

 import java.util.Scanner;
 

class DieRoll{
    Scanner input = new Scanner (System.in);
    private int dieface = 0;

    public void rollDie(){
        dieface = (int) ((Math.random() * 6) + 1);
    }
    public void setDie(){
        System.out.print("What would you like to set the die to?:");
        dieface = input.nextInt();
        if (dieface > 6 ){
            System.err.println("You can only set the die to numbers between 1-6, please try again.");
            System.out.print("What would you like to set the die to?:");
            dieface = input.nextInt();
        } else if (dieface < 1){
            System.err.println("You can only set the die to numbers between 1-6, please try again.");
            System.out.print("What would you like to set the die to?:");
            dieface = input.nextInt();
        }

    }
    public void displayDie(){
        if (dieface == 1){
            System.out.println("-----------");
            System.out.println("|         |");
            System.out.println("|    0    |");
            System.out.println("|         |");
            System.out.println("-----------");
        } else if (dieface == 2){
            System.out.println("-----------");
            System.out.println("|  0      |");
            System.out.println("|         |");
            System.out.println("|       0 |");
            System.out.println("-----------");
        }else if (dieface == 3){
            System.out.println("-----------");
            System.out.println("|  0      |");
            System.out.println("|    0    |");
            System.out.println("|      0  |");
            System.out.println("-----------");
    }   else if (dieface == 4){
        System.out.println("-----------");
        System.out.println("|  0    0 |");
        System.out.println("|         |");
        System.out.println("|  0    0 |");
        System.out.println("-----------");
}       else if (dieface == 5){
         System.out.println("-----------");
         System.out.println("|  0   0  |");
         System.out.println("|    0    |");
         System.out.println("|  0   0  |");
         System.out.println("-----------");
} else {
         System.out.println("-----------");
         System.out.println("|  0    0 |");
         System.out.println("|  0    0 |");
         System.out.println("|  0    0 |");
         System.out.println("-----------");
}
    }

}

public class PartD {
    public static void main(String[] args) {
        DieRoll die = new DieRoll();
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
        String userInput = in.nextLine();
        
        while (userInput.toUpperCase().equals("Q") == false) {

        if (userInput.toUpperCase().equals("R")){
            die.rollDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else if (userInput.toUpperCase().equals("S")){
            die.setDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else if (userInput.toUpperCase().equals("D")){
            die.displayDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else {
            System.err.println("This is not an option for interacting with the die. Please try again.");
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
}
}
    System.out.println("You have thrown the die off the table and lost it. Goodbye!");
    }
}

        
    

