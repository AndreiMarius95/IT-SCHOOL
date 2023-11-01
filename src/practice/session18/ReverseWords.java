package practice.session18;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {
        //Problem 5
        //Given a sentence, reverse the order of the words in the sentence,
        // but not the order of the letters in each word.
        // For instance, "Java is fun" should become "fun is Java".

        String sentence = "Cow goes moo";
        String[] sentenceArr = sentence.split(" ");

        Collections.reverse(Arrays.asList(sentenceArr));
        System.out.println(Arrays.asList(sentenceArr));
    }
}