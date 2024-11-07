// Alex Benson
// Unit 05 AT07 HW Part A
// 11/6/24

import java.util.Scanner;

public class Die {

    private int dieface = 0;

    //construction
    public Die(){
        setDie(1);
    }

    //overload construction
    public Die(int orgiVal){
        setDie(orgiVal);
    }

    //overload construction
    public Die(double inputVal){
        setDie((int)inputVal);
    }

    public void rollDie(){
        //this randomizes the dice roll to an integer between 1 and 6
        dieface = (int) ((Math.random() * 6) + 1);
    }

    //sets the dieface
    public void setDie(int newVal){
        if (newVal > 0 && newVal <= 6){
            dieface = newVal;   
        } else {
            System.err.println("You can only set the die to a number between 1 and 6! Please try again!");
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
} else if (dieface ==6) {
         System.out.println("-----------");
         System.out.println("|  0    0 |");
         System.out.println("|  0    0 |");
         System.out.println("|  0    0 |");
         System.out.println("-----------");
}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What would you like to set the die to: ");
    
        //intialize instance of Die class
        Die myDie = new Die(in.nextInt());
        myDie.displayDie();
    }

}