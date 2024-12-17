// Alex Benson
// HW Advanced Topic #8, Part A
// 12/17/24

//import local date and time classes
import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {

    public static void main(String[] args) {

        // get local time and date
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // display info to user
        System.out.println("The current date is: " + date);
        System.out.println("The current time is: " + time);

    }
}
