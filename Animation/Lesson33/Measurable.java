package Lesson33;

import java.util.ArrayList;

public interface Measurable {
    // return a measurable quantity
    // that can be used, for example,
    // to calculate an average.
    double getMeasure();

    public static final double PI = 3.14159;

    public static double calcAvg(ArrayList<Measurable> list) {
        if (list.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (Measurable item : list) {
            sum = sum + item.getMeasure();
        }

        double avg = sum / list.size();
        return avg;
    }
}
