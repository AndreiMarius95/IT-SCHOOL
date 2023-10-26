package practice.session16.calculator;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = (a, b, operator) -> executeOperation(a, b, operator);

        System.out.println("Result: " + calculator.calculate(10, 10, '*'));
    }

    private static double executeOperation(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}