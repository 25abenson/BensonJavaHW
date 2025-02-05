//Alex Benson
// Lesson 29 Part A
// 2/5/25

public class PartA {

    public static void main(String[] args) {

        // print info
        System.out.println("ORIGINAL BIKE SPEEDS");

        // new geared bike
        GearedBicycle alexGearedBicycle = new GearedBicycle();

        // new regular bike
        Bicycle caseyBicycle = new Bicycle();

        // pedal both bikes the same amount
        caseyBicycle.pedal();
        alexGearedBicycle.pedal();
        caseyBicycle.pedal();
        alexGearedBicycle.pedal();

        // display speeds again
        System.out.print("Alex's Bike: ");
        alexGearedBicycle.display();
        System.out.print("Casey's Bike: ");
        caseyBicycle.display();

        // brake both
        alexGearedBicycle.brake();
        caseyBicycle.brake();

        System.out.println();
        System.out.println("AFTER BRAKING ONCE");

        // display speeds again
        System.out.print("Alex's Bike: ");
        alexGearedBicycle.display();
        System.out.print("Casey's Bike: ");
        caseyBicycle.display();
    }
}
