package practice.session14;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updatedList = getUpdatedList(myList, 1, 10);
        System.out.println(updatedList);

        List<Integer> evenNumbers = getEvenNumbersList(myList);
        System.out.println(evenNumbers);

        int maxValue = findMaximum(myList);
        System.out.println(String.format("Max value is: %d", maxValue));
    }

    private static Integer findMaximum(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Invalid list or empty");
            return null;
        }

        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    private static List<Integer> getEvenNumbersList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    private static List<Integer> getUpdatedList(List<Integer> list, int index, int value) {
        if (index >= list.size() || index < 0) {
            System.out.println("Invalid index");
            return list;
        }

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    private static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }
}