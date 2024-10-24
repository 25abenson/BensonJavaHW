
class Light {
    // private member variables.
    // when a member is private, only the Light object can "see it".
    // the state is true if the light is on.
    private boolean state = false;

    // external objects use the public methods declared below
    // to interact with our virtual light.

    // return the current state of the bulb.
    public boolean view() {
        return state;
    }

    // turn on the bulb.
    public void turnOn() {
        state = true;
    }

    // turn off the bulb
    public void turnOff() {
        state = false;
    }
}

public class PartB {
    public static void main(String[] args) {
        // declare a variable of Light type.
        // use new operator to instantiate a new Light object.
        Light light = new Light();

        // display current state.
        System.out.println("Light state: " + light.view());

        // turn on the bulb.
        light.turnOn();

        // display current state.
        System.out.println("Light state: " + light.view());
    }
}
