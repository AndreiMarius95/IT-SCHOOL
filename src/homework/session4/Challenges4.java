package homework.session4;

import java.util.Scanner;

public class Challenges4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a height value(cm): ");
            int heightOne = scanner.nextInt();

            System.out.println("Enter another height value(cm): ");
            int heightTwo = scanner.nextInt();

            //String result = (heightOne > heightTwo) ? "The first height value is greater than the second one." : "The second height value is greater than the first one.";
           // System.out.println(result);
            //////////////////////////////////////////////////////////
           // System.out.println(result);
            if (heightOne == heightTwo)
                System.out.println("Number equal");
            else
                if (heightOne > heightTwo)
                    System.out.println(" 1 Is Big ");
                else
                    System.out.println("2 Is Big ");

        }
    }

