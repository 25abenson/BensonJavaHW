package Unit04.Lesson08;

//Alex Benson
// Lesson 08 HW Part A
// 10/18/24

public class HWPartA {

    public static void main(String[] args) {

        int year30 = 0;
        double C = 100.00;
        while (C > 1){ 
            C = C / 2;
            year30++;
        }
       
        year30 = year30 * 30;
        System.out.println("It will take " + year30 + " years for 99% of the original Cesium to decay.");
        System.out.println("There will be %" + C + " cesium left.");


    }

}