package HomeWork.Session4;

import java.util.Scanner;

public class Challenges6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Hot <3");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}

