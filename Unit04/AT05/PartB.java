
import java.util.Scanner;

class DimmableLight {
    // private member variables.
    // when a member is private, only the Light object can "see it".
    // the state is true if the light is on.
    private boolean state = false;
    
    private int brightness = 1;

    // external objects use the public methods declared below
    // to interact with our virtual light.

    // return the current state of the bulb.
    public boolean view() {
        return state;
    }

    //returns the current brightness of the light bulb
    public int viewBrightness(){
        return brightness;
    }
    

    // turn on the bulb.
    public void turnOn() {
        state = true;
    }

    // turn off the bulb
    public void turnOff() {
        state = false;
    }

    //increase brightness by one, max is 10
    public void upBrightness() {
        if (brightness < 10) {
            brightness++;
        } else {
            System.out.println("Brightness is already at maximum.");
        }
    }

    // Decrease brightness by 1, down to min of 1
    public void downBrightness() {
        if (brightness > 1) {
            brightness--;
        } else {
            System.out.println("Brightness is already at minimum.");
        }
    }
}


public class PartB {
    public static void main(String[] args) {
        // declare a variable of Light type.
        // use new operator to instantiate a new Light object.
        DimmableLight light = new DimmableLight();
        Scanner in = new Scanner(System.in);

        // display current state.
        System.out.println("Light state: " + light.view());

        //prompt user for input
        System.out.println("How would you like to interact with the lightbulb?");
        System.out.print("(On, Off, View, Up, Down, or q): ");
        String userInput = in.nextLine();

        //loop as long as the user does not type "q" for quit
        while (userInput.toUpperCase().equals("Q") == false){

            //displays the sate of light bulb and level of brightness
        if (userInput.toUpperCase().equals("VIEW")){
            System.out.println("Light state: " + light.view());
            System.out.println("Light Brightness: " + light.viewBrightness());
            System.out.print("Next input: ");
            userInput = in.nextLine();
        }
        else if (userInput.toUpperCase().equals("ON")){
            //turns on light bulb
            light.turnOn();
            System.out.print("You have turned on the light bulb. Next input: ");
            userInput = in.nextLine();
            
        }
        else if (userInput.toUpperCase().equals("OFF")){
            //turns off lightbulb
            light.turnOff();
            System.out.print("You have turned off the light bulb. Next input: ");
            userInput = in.nextLine();
        }
       else if (userInput.toUpperCase().equals("UP")){
        //increases brightness
            light.upBrightness();
            System.out.print("You have increased the brightness of the lightbulb by one. Next input: ");
            userInput = in.nextLine();
        }
        else if (userInput.toUpperCase().equals("DOWN")){
            //decreasses brightness
            light.downBrightness();
            System.out.print("You have decreased the brightness of the lightbulb by one. Next input:");
            userInput = in.nextLine();
            
        } else {
            //if other input display error message
            System.err.println("This is not an option for interacting with this lightbulb, please try again.");
            System.out.print(" What would you like to do: ");
            userInput = in.nextLine();
        }
    }
//if "q" is typed this will quit system
    System.out.println("You have exited. Goodbye!");

    }
}
