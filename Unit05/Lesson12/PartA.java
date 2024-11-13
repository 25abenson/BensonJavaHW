// Alex Benson
// Lesson 12 HW Part A
// 11/13/24


import java.util.Scanner;

public class PartA {

/*
 * public class Conversation
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int input = in.nextInt(); PROBLEM IN THIS LINE BECAUSE "INPUT" WAS USED AS A NAME FOR A STRING AND THIS INTEGER, CHANGE THE NAME FOR IT TO WORK
      input++;
      System.out.println("Next year, you will be " + input);
   }
}

 */



   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int inputInt = in.nextInt(); //the "input" varibable is repeated, name this something else, I called it inputInt
      inputInt++;
      System.out.println("Next year, you will be " + inputInt);
   }
}


