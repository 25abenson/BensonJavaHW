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

        //gets if the day of the week of the first day
        DayOfWeek firstDayOfWeek = firstOfMonth.getDayOfWeek();
       
        //calculates how many spaces needed till calendar gets to the day of the week of the first day
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

        //prints the number of spaces needed (calculated above)
        for (int i = 0; i < spaces; i++){
            System.out.print(" ");
        }

        //gets length of month
        int numofDaysinMonth = month.length(false);
        //assigns the current calendar day to the first day of month
        LocalDate currentCal = firstOfMonth;
    
        //loop will continue till all integers of the days of month are printed
        for (int i = 0; i < numofDaysinMonth; i++){
            //prints integer for current calendar day in correct format
            if (currentCal.getDayOfMonth() <= 9){
                System.out.print("  " + currentCal.getDayOfMonth());
            } else {
                System.out.print(" " + currentCal.getDayOfMonth());
            }
            //if the einteger for today = the integer that is is currently printing, prints *
            if (today.getDayOfMonth() == currentCal.getDayOfMonth()){
                System.out.print("*");}
            else {
                //if not just prints space
                System.out.print(" ");
            }
            //if it is sunday, calendar goes to next line
            if (currentCal.getDayOfWeek().getValue() == 7){
                System.out.println("");
            }
            //day is increased by one and then loop is repeated
            currentCal = currentCal.plusDays(1);
    
        }
       

    }
}