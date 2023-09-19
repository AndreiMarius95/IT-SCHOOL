package HomeWork.session2;

import java.util.Scanner;

public class SimpleInputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar1 :");
        double num1 = scanner.nextDouble();

        System.out.println("Numar2 :");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("Result :" + sum);
    }
}
