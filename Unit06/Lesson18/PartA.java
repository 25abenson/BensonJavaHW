//Alex Benson
// Lesson 18 Part A HW
// 12/13/24

import java.util.ArrayList;

public class PartA {
    public static void main(String[] args) {
        
        //create array list
        ArrayList<String> names = new ArrayList<String>();

        //add elements to array list
        names.add("Alex");
        names.add("Lucy");
        names.add("Av");
        names.add("Chloe");

        //iterate through list and print on seperate lines
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}
