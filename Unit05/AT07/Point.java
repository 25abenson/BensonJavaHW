// Alex Benson
// Unit 05 AT07 HW Part B
// 11/6/24

import java.util.Scanner;

public class Point {
    
    // set member variables
    private double x;
    private double y;
    private double angle = ((Math.atan(y/x)) * 360)/(2*Math.PI);
    private double r = Math.sqrt((x*x)+ (y*y));
   

    //construction
    public Point(){
        setPoint(0,0);
    }

    //overload construction
    public Point(double origValX, double origValY){
        setPoint(origValX, origValY);
        r = Math.sqrt((origValX*origValX)+ (origValY*origValY));
        angle = ((Math.atan(origValY/origValX)) * 360)/(2*Math.PI);
    }

    // set point coordinates
    public void setPoint(double newValX, double newValY){
        x = newValX;
        y = newValY;
        r = Math.sqrt((newValX*newValX)+ (newValY*newValY));
        angle = Math.tan((Math.atan(newValY/newValX)) * 360)/(2*Math.PI);
    }

    //returns x value
    public double getXVal(){
        return x;
    }

    //returns y value
    public double getYVal(){
        return y;
    }

    // returns r value
    public double getrVal(){
        return r;
    }

    // returns angle value
    public double getAngle(){
        return angle;
    }

    // translates the point and displays new coordinates
    public void translatePoint(double newVala, double NewValb){
        x = x + newVala;
        y = y + NewValb;
        System.out.println("Your new cartesian coordinates are (" + x + "," + y + ")");
    }

    // gets distance to another point
    public double distanceTo(double c, double d){
        double e = c-x;
        double f = d-y;
        double distance = Math.sqrt((e*e)+ (f*f));
        return distance;
    }
public static void main(String[] args) {
    //creates instance of scanner class
    Scanner in = new Scanner(System.in);

    //create instance of Point Class by using constructor
    System.out.print("What would you like the coordinates of your point ot be (enter only x value and y value): ");
    // assigns x and y values to the point
    Point myPoint = new Point(in.nextDouble(),in.nextDouble());
    
    //displays variable values to the user
    System.out.println("The x value of your point is " + myPoint.getXVal());
    System.out.println("The y value of your point is " + myPoint.getYVal());
    System.out.println("The r value of your point is " + myPoint.getrVal());
    System.out.println("The angle to your point from the origin is " + myPoint.getAngle()  + " degrees");

    // gets point from user and displays distance to that point
    System.out.print("What point would you like to know the distance to (enter only x value and y value): ");
    System.out.println("The distance to that coordinate is " + myPoint.distanceTo(in.nextDouble(), in.nextDouble()) + " unit(s)");

    // gets the amount you would like to translate the point by and displays new point to user
    System.out.print("What would you like to translate the point to (enter only x value and y value): ");
    myPoint.translatePoint(in.nextDouble(), in.nextDouble());
    
    
}
}
