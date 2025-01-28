//Alex Benson
// Lesson 25 HW 
// 1/28/25

import java.util.Scanner;

public class Car {

    // declare speed as private variable
    private double speed;

    // constructor
    public Car() {
        speed = 0;
    }

    // overrride constructor
    public Car(double inputspeed) {
        speed = inputspeed;
    }

    // method that returns speed
    public double getSpeed() {
        return speed;
    }

    // method to accelerate
    public void accelerate() {
        if (speed < 120) {
            speed++;
        } else {
            System.out.println("Car is already at max speed. Cannot accelerate.");
        }
    }

    // method to decelerate
    public void brake() {
        if (speed > 0) {
            speed = speed - 0.1;
        } else {
            System.out.println("Car is already not moving. Cannot brake.");
        }
    }

    public static void main(String[] args) {

        // instance of scanner
        Scanner in = new Scanner(System.in);

        // ask for beginning speed from user
        System.out.print("What would you like to set your car's speed at (between 0 and 120): ");
        double inputspeed = in.nextDouble();

        // instance of car
        Car myCar = new Car(inputspeed);

        // displays current speed
        System.out.printf("Current speed: %6.2f mph %n", myCar.getSpeed());

        // loop for acclertion or braking until user quits the program
        while (true) {
            // prompts user for acceleration or braking
            System.out.print("Would you like to accelerate (A) or brake (B) or type q to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")) {
                // if they type q quit the program and display final speed
                in.next();
                System.out.println("You have quit the program. Goodbye! ");
                System.out.printf("Final speed: %6.2f mph %n", myCar.getSpeed());
                break;
            } else if (in.hasNext("A") || in.hasNext("a")) {
                // if they accelerate use the acceleration function
                in.next();
                myCar.accelerate();
                System.out.printf("Current speed: %6.2f mph %n", myCar.getSpeed());
            } else if (in.hasNext("B") || in.hasNext("b")) {
                // if they brake use break function
                in.next();
                myCar.brake();
                System.out.printf("Current speed: %6.2f mph %n", myCar.getSpeed());
            } else {
                // if not a specified input ask the user again
                in.next();
                System.out.println("Not one of the specified inputs. Try again.");
            }
        }
    }

}