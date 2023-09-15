package Practice.Session5;

public class DoWhileExercises {
    public static void main(String[] args) {
        printNumbers();
        printReverseCounter();
    }

    public static void printNumbers() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number < 11);
    }

    public static void printReverseCounter() {
        int number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number >= 1);
    }
}