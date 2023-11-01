package practice.session18;

import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {
        String sentence = "Today is Halloween";

        long counter = Arrays.stream(sentence.split(" "))
                .filter(word -> word.length() > 3)
                .count();
        System.out.println(counter);
    }
}