package practice.session17;

import practice.session8.shoppingcart.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "peach", "watermelon");
        List<Product> products = Arrays.asList(
                new Product("Phone" + 599.9959),
                new Product("Gadged" + 9450.99),
                new Product("Laptop" + 2499.99));
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4), Arrays.asList(4, 5, 6, 7, 8, 9), Arrays.asList(9, 10));
//        printEvenNumbers(integerList);

//        printEveneNumbersWithStream(integerList);
//        printStringsByLength(strings, 6);
//        printStringsLength(strings);
//        printProductsPrice(products);
//        printProductIncreasedPrices(products);
//        printFlatMap(listOfLists);
//        printSumOfNumbers(integerList);
//        printSortedProductsByPrice(products);
//        printProcessedNumbers(integerList);
        printAnyMatchFruit(strings);
    }

    private static void printAnyMatchFruit(List<String> strings) {
        boolean anyMatch = strings.stream()
                .filter(fruit -> fruit.length() > 5)
                .anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println("Is there any fruit with length > 5 and that starts with 'a': " + anyMatch);
    }

    private static void printProcessedNumbers(List<Integer> integerList) {
        integerList.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .filter(num -> num > 20)
                .forEach(System.out::println);
    }

    private static void printSortedProductsByPrice(List<Product> productList) {
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProducts.forEach(product -> System.out.println(product.getName() + " : " + product.getPrice()));
    }

    private static void printSumOfNumbers(List<Integer> integerList) {
        int sum = integerList.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers using reduce: " + sum);
    }

    private static void printFlatMap(List<List<Integer>> listOfLists) {
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattened list: " + flattenedList);
    }

    private static void printProductIncreasedPrices(List<Product> productList) {
        List<String> formatedPrices = productList.stream()
                .map(product -> product.getPrice() * 1.10)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println("Increased prices: " + formatedPrices);
    }

    private static void printProductsPrice(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(System.out::println);
    }

    private static void printStringsLength(List<String> inputList) {
        List<Integer> list = inputList.stream()
                .map(String::length)
                .toList();
        System.out.println("String lengths: " + list);
    }

    private static void printStringsByLength(List<String> list, int minLength) {
        List<String> filteredList = new ArrayList<>();
        for (String str : list) {
            if (str.length() >= minLength) {
                filteredList.add(str);
            }
        }
        System.out.println("Traditonal approach: " + filteredList);

        List<String> filterWithLambda = filteredList.stream()
                .filter(str -> str.length() >= minLength)
                .toList();
        System.out.println("Stream approach: " + filterWithLambda);
    }

    private static void printEveneNumbersWithStream(List<Integer> integerList) {
        List<Integer> evenNumsStream = integerList.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumsStream);
    }

    private static void printEvenNumbers(List<Integer> integerList) {
        List<Integer> evenNums1 = new ArrayList<>();
        for (int num : integerList) {
            if (num % 2 == 0) {
                evenNums1.add(num);
            }
        }
        System.out.println("Traditional way: " + evenNums1);
    }
}