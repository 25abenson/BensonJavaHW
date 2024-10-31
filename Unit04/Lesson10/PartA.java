//Alex Benson
// Lesson 10 Part A HW
// 10/31/24

public class PartA {
    public static void main(String[] args) {
    

        //this is a run time error because since the numbering of characters of a string starts with zero
        // Harry is numbered h = 0, a = 1, r = 2, r = 3, y = 4
        //there is no character at name.length() which equals 5
        //to get the last character you subtract one from name.length()

        String name = "Harry";
        System.out.println("The last letter of the name is " + name.charAt(name.length() - 1));



}

    }

