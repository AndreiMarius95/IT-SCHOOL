package Practice.Session4;

public class StringMemoryReference {
    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "hello";
        String greetingTwo = "Hello";

        System.out.println(greetingOne == greetingTwo); //false
        System.out.println(greetingOne.equalsIgnoreCase(greetingTwo)); //true

        System.out.println(greeting == greetingOne); //false
        System.out.println(greeting.equals(greetingOne)); //false

        int number1 = 10;
        double number2 = 10.0;
        System.out.println(number1 == number2);
    }
}

