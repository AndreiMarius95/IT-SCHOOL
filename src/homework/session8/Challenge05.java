package homework.session8;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("New York");

        checkDuplicateInputCity(cities);
        System.out.println(cities);
    }

    public static void checkDuplicateInputCity(ArrayList<String> cityArr) {
        String input = getUserInput();

        if (cityArr.contains(input)) {
            System.out.println(input + " is already in array");
        } else {
            cityArr.add(input);
            System.out.println(input + " was added");
        }
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a city to add");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}

