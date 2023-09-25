package homework.session3;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulus = num1 % num2;
        System.out.println("Suma: " + sum);
        System.out.println("Dif: " + difference);
        System.out.println("Prod: " + product);
        if (num2 != 0)
            System.out.println("Câtul: " + quotient);
        System.out.println("Restul: " + modulus);
        System.out.println("Cannot be divided by 0.");
    }
}

