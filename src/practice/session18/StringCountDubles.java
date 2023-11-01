package practice.session18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountDubles {

    public static void main(String[] args) {
        //Problem 4
        //Given a List of strings, find which strings have duplicates and how many duplicates each string has.
        // Store this information in a HashMap where the key is the string and the value is the count of occurrences.
        // Print the resulting map.
        List<String> pets = Arrays.asList("dog", "cat", "duck", "dog", "duck", "duck");
        Map<String, Long> duplicates = finDuplicates(pets);

        duplicates.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    private static Map<String, Long> finDuplicates(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}