// Alex Benson
// Lesson09 HW Part B
// 10/25/24


import java.util.Scanner;


public class PartB {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String phrase;
        System.out.print("Enter your phrase:");
        phrase = in.nextLine();
        int numE = 0;
        int c = 0;
        
        
//this loops scans through each character and compares it to 'e'
     for (int i = phrase.length(); i > 0; i--) {
        //gets the character
        char character = phrase.charAt(c);
      
        if (character == 'e'){
            //if the character is e, the variable numE is increased by 1
            numE = numE + 1;
            
        }
        if (character == 'E'){
            //if the character is E, the variable numE is increased by 1
            numE = numE + 1;
        }
        //then the char number is increased by one and the loop repeats till the entire phrase has been scanned
        c = c + 1;
    }

    if (numE == 1) {
        //this is just proper grammar is there is only one e
        System.out.println("There is 1 E in your phrase.");
    } else{
        //prints the number of e's in the program to user
        System.out.println("There are " + numE + " E's in this phrase.");
    }

    } 
}
