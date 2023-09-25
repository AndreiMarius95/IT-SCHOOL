package homework.session7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayingTodaysDate {

    public static void main(String[] args) {
        displayTodaysDate();
    }

    private static void displayTodaysDate() {
        LocalDate currentDate1 = LocalDate.now();
        LocalDate currentDate2 = LocalDate.now();
        System.out.println("Today's date: " + currentDate1);
        System.out.println("Today' s date2:  " + currentDate2.format(DateTimeFormatter.ofPattern("dd.MM.yy")));

    }
}