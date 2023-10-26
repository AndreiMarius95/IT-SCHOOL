package practice.session16.conditional_printer;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (str, condition) -> showCondition(str, condition);


        conditionalPrinter.print("Hello world", true);
        conditionalPrinter.print("Another hello world", false);
    }

    //ctrl + alt + m -> extract the code to a new method
    private static void showCondition(String str, boolean condition) {
        if (condition) {
            System.out.println(str);
        }
    }
}