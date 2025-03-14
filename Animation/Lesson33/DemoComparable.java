package Lesson33;

public class DemoComparable {

    public static void main(String[] args) {

        // instatiate cat
        Animal cat = new Animal("Cali", 10);

        // instatiate dog
        Animal dog = new Animal("Sparky", 30);

        // compare
        System.out.println("compareTo returns: " + dog.compareTo(cat));
        System.out.println("Therefore dog weighs more than cat.");

    }

}
