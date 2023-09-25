package practice.session7.practice_session7;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String input = scanner.nextLine();
//
//        System.out.println("You entered: " + input);

//        printConsoleSum(scanner);
        printConsoleAverage(scanner);
    }

    public static void printConsoleAverage(Scanner scanner) {
        double sum = 0;

        for (int index = 0; index < 5; index++) {
            System.out.println("Enter your number:");
            sum += scanner.nextInt();
        }

        double average = sum / 5;
        System.out.println("The average is: " + average);
    }

    public static void printConsoleSum(Scanner scanner) {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}