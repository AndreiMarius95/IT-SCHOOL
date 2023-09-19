package HomeWork.session4;

import java.util.Scanner;

public class Chalenges7 {
    public static void main(String[] args) {
        System.out.println("Find out what type of triangle it is!");

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the first side: ");
        int sideOne = scanner.nextInt();

        System.out.println("Enter the value of the second side: ");
        int sideTwo = scanner.nextInt();

        System.out.println("Enter the value of the third side: ");
        int sideThree = scanner.nextInt();


        boolean isEquilateral = sideOne == sideTwo && sideOne == sideThree;
        boolean isIsosceles = sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree;
        String result1 =
                isEquilateral ?
                        "Equilateral" :
                        isIsosceles ?
                                "Isosceles" :
                                "Scalene";
        System.out.println(result1);
    }
}
