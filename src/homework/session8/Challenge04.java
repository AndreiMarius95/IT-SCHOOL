package homework.session8;

public class Challenge04 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 10, 13, 7, 6, 15, 4, 24};
        printEvenAndOddCount(numbers);
    }

    public static void printEvenAndOddCount(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("There are " + countEven + " even numbers and " + countOdd + " odd numbers.");
    }
}

