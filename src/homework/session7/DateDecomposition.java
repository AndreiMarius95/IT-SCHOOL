package homework.session7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDecomposition {
    public static void main(String[] args) {
        Date current = new Date();
        displayDateComponents(current);
    }
        private static void displayDateComponents(Date current){
            SimpleDateFormat onlyYear = new SimpleDateFormat("yyyy");
            SimpleDateFormat onlyMonths = new SimpleDateFormat("MM");
            SimpleDateFormat onlyDays = new SimpleDateFormat("dd");

            String year = onlyYear.format(current);
            String month = onlyMonths.format(current);
            String day = onlyDays.format(current);
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);

        }
        }


