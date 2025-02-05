
public class GearedBicycle extends Bicycle {

    // member variables
    private final int MAXGEARS = 6;
    private int gear = 1;
    private final int GEARED_MAX_SPEED = 30;

    // constructor
    public GearedBicycle() {
        super();
        this.gear = 1;
    }

    // get gear
    public int getGear() {
        return gear;
    }

    // set gear
    public void setGear(int gear) {
        if (gear > 0 && gear <= MAXGEARS) {
            this.gear = gear;
        }
    }

    // shift up
    public void shiftUp() {
        gear++;
        if (gear > MAXGEARS) {
            gear = MAXGEARS;
        }
    }

    // shift down
    public void shiftDown() {
        gear--;
        if (gear < 1) {
            gear = 1;
        }
    }

    /*
     * Override pedal() method
     * to account for the gears when accelerating the speed
     * of the bicycle.
     */
    public void pedal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }

    // override brake
    public void brake() {
        int newSpeed = getSpeed() - 2;
        if (getSpeed() < 0) {
            newSpeed = 0;
        }
        setSpeed(newSpeed);
    }

    // override display
    public void display() {
        System.out.printf("Gear = %02d ", getGear());
        super.display();
    }

    public static void main(String[] args) {

        GearedBicycle g = new GearedBicycle();
        System.out.println(g.getSpeed());
        g.pedal();
        System.out.println(g.getSpeed());

    }

}
