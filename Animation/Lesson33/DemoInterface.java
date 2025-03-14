package Lesson33;

import java.util.ArrayList;

public class DemoInterface {
    public static void main(String[] args) {

        // new animal
        Animal dog = new Animal("Bessie", 1000);
        Measurable m = dog;

        // print measurable
        System.out.println(m.getMeasure());

        ArrayList<Measurable> animals = new ArrayList<>();
        animals.add(dog);
        dog = new Animal("Bob", 1500);
        animals.add(dog);

        System.out.println("Avg measrable weight = " + Measurable.calcAvg(animals));
    }
}
