package practice.session16.conditional_printer;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String str, boolean condition);
}