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
        //this randomizes the dice roll to an integer between 1 and 6
        dieface = (int) ((Math.random() * 6) + 1);
    }
    public void setDie(){
        //this allows the user to set ethe die
        System.out.print("What would you like to set the die to?:");
        dieface = input.nextInt();
        //if they go outside of the 1-6 range they will see this error message
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
        //this allows the user to view the die, it is in a format that looks like a virtual dice
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
        //creates an instance of the DieRoll class
        DieRoll die = new DieRoll();
        //creates scanner instance
        Scanner in = new Scanner (System.in);
        //displays the message to user and sets the input as a string
        System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
        String userInput = in.nextLine();
        
        while (userInput.toUpperCase().equals("Q") == false) {
            //as long as the user does not type Q this loop will continue

        if (userInput.toUpperCase().equals("R")){
            //rolls the die if R is typed and then allows user to input something else
            die.rollDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else if (userInput.toUpperCase().equals("S")){
            //sets the die if S is typed and then allows user to input something else
            die.setDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else if (userInput.toUpperCase().equals("D")){
            //displays the die if D is typed and then allows user to input something else
            die.displayDie();
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
        } else {
            //if not one of the four options is entered, the user gets an error message and is asked to reenter something else
            System.err.println("This is not an option for interacting with the die. Please try again.");
            System.out.print("Enter 'r' to roll, 'd' to display, 's' to set, or 'q' to quit: ");
            userInput = in.nextLine();
}
}   //if Q is typed the program ends with this message
    System.out.println("You have thrown the die off the table and lost it. Goodbye!");
    }
}

        
    

