package org.derryfield.math;

public class Geometry {

    // create volume method with radius as input
    public static double calcVolSphere(double r) {
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        return volume;
    }

    // create surface area method with radius as input
    public static double calcSurfSphere(double r) {
        double surfArea = 4 * Math.PI * r * r;
        return surfArea;
    }

}
