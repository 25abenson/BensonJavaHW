// Alex Benson
// HW Advanced Topic #8, Part B
// 12/17/24

//input geometry class
import math.Geometry;

public class PartB {
    public static void main(String[] args) {

        // instance of geo class
        Geometry sphere = new Geometry();

        // input the radius
        double r = 7;

        // use created methods to find surf area and volume
        double vol = sphere.calcVolSphere(r);
        double surfArea = sphere.calcSurfSphere(r);

        // display info to user
        System.out.println("Volume: " + vol);
        System.out.println("Surface Area: " + surfArea);
    }
}
