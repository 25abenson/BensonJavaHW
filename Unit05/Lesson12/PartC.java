// Alex Benson
// Lesson 12 HW Part C
// 11/13/24

import java.util.Scanner;

public class PartC {

    // determines if it is a vowel
    public static boolean isVowel(char c){
        if (c == 'a')
        return true;
        else if (c == 'e')
        return true;
        else if (c == 'i')
        return true;
        else if (c == 'o')
        return true;
        else if (c == 'u')
        return true;
        else if (c == 'A')
        return true;
        else if (c == 'E')
        return true;
        else if (c == 'I')
        return true;
        else if (c == 'O')
        return true;
        else if (c == 'U')
        return true;
        else {
            return false;
        }
    }
    
    public static int countVowels(String phrase){

        //starts at char 0
        int i = 0; 
        int voweltotal = 0;

        //loop that goes through the phrase and if it is a vowel adds to the total vowel count
        for (int namelength = phrase.length() - 1; namelength > 0; namelength--){
            boolean vowel = isVowel(phrase.charAt(i));
            if (vowel == true){
                voweltotal++;
                i++;
            } else {
                i++;
            }
        }
        return voweltotal;
    }

    public static void main(String[] args) {
        // intializes instance Scanner
        Scanner in = new Scanner(System.in);

        //gets phrase from user
        System.out.print("Enter a phrase: ");

        //assigns variable
        String phrase = in.nextLine();

        //calls count Vowels method
        int numVowel = countVowels(phrase);

        //display to user
        System.out.println("The number of vowels is: " + numVowel);




    }
        
}
