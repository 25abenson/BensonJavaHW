// Alex Benson
// AT06 HW - Using Classes
// 10/29/24


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class PartA{

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth() - 1);
        Month month = today.getMonth();

        //finds out how mnany spaces on either side of the name of the month
        int length = month.toString().length();
        int spaces = (28 - length) / 2;

        //formatting for printing the header, will print spaces until it month is centered and then prints month
        for (int i = 0; i < spaces; i++ ){
            System.out.print(" ");
        } System.out.println(month.toString());
        //prints days of week
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        DayOfWeek firstDayOfWeek = firstOfMonth.getDayOfWeek();
       

        switch (firstDayOfWeek){
            case MONDAY:
            spaces = 0;
            break;
            case TUESDAY:
            spaces = 4;
            break;
            case WEDNESDAY:
            spaces = 8;
            break;
            case THURSDAY:
            spaces = 12;
            break;
            case FRIDAY:
            spaces = 16;
            break;
            case SATURDAY:
            spaces = 20;
            break;
            case SUNDAY:
            spaces = 24;
            break;
        }

        for (int i = 0; i < spaces; i++){
            System.out.print(" ");
        }

        int numofDaysinMonth = month.length(false);
        LocalDate currentCal = firstOfMonth;
    
        for (int i = 0; i < numofDaysinMonth; i++){
            if (currentCal.getDayOfMonth() <= 9){
                System.out.print("  " + currentCal.getDayOfMonth());
            } else {
                System.out.print(" " + currentCal.getDayOfMonth());
            }
            if (today.getDayOfMonth() == currentCal.getDayOfMonth()){
                System.out.print("*");}
            else {
                System.out.print(" ");
            }
            if (currentCal.getDayOfWeek().getValue() == 7){
                System.out.println("");
            }
            currentCal = currentCal.plusDays(1);
    
        }
       

    }
}