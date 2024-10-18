package Unit04.Lesson08;

//Alex Benson
// Lesson 08 HW Part A
// 10/18/24

public class HWPartA {

    public static void main(String[] args) {

        //set varibles
        // C is the percent of Cesium and year30 is the amount of 30 year periods for it to decay
        int year30 = 0;
        double C = 100.00;
        // below loops until Cesium percentage is less than one
        while (C > 1){ 
            C = C / 2;
            year30++;
        }
       
        //multiply amount fo 30 year periods by 30 to get number of years total
        year30 = year30 * 30;
        //display info to user
        System.out.println("It will take " + year30 + " years for 99% of the original Cesium to decay.");
        System.out.println("There will be %" + C + " cesium left.");


    }

}