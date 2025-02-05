public class Demo {

    public static void print(Bicycle b) {
        System.out.printf("Speed = %02d MPH%n", b.getSpeed());
    }

    public static void main(String[] args) {
        Bicycle stevesBicycle = new Bicycle();
        stevesBicycle.pedal();
        stevesBicycle.pedal();
        System.out.print("Steve's bike: ");
        print(stevesBicycle);

        GearedBicycle tracysBicycle = new GearedBicycle();
        tracysBicycle.shiftUp();
        tracysBicycle.pedal();
        tracysBicycle.pedal();
        System.out.print("Tracy's bike: ");
        print(tracysBicycle);
        System.out.println("current gear = " + tracysBicycle.getGear());
    }
}
